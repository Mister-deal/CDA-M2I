package com.example.correction_service_tv.aspect;

import com.example.correction_service_tv.entity.Follower;
import com.example.correction_service_tv.entity.Season;
import com.example.correction_service_tv.entity.Series;
import com.example.correction_service_tv.service.MailService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.correction_service_tv.repository.FollowerRepository;

import java.util.List;

@Aspect
@Component
public class SeasonAdditionAspect {

    @Autowired
    private MailService emailService;

    @Autowired
    private FollowerRepository followerRepository;

    @Pointcut("execution(* com.example.correction_service_tv.repository.SeriesRepository.save(*)) && args(series)")
    public void saveSeason(Series series) {}

    @AfterReturning(value = "saveSeason(series)", returning = "result")
    public void afterSavingSeason(JoinPoint joinPoint, Series series, Object result) {

            List<Follower> followers = followerRepository.findByFollowedSeries(series);
            for (Follower follower : followers) {
                emailService.sendEmail(follower.getEmail(), "Nouvelle saison ajoutée",
                        "Une nouvelle saison a été ajoutée à la série " + series.getName());
            }
        }

}

