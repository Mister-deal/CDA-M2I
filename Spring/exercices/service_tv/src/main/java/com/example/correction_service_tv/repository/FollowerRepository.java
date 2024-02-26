package com.example.correction_service_tv.repository;

import com.example.correction_service_tv.entity.Follower;
import com.example.correction_service_tv.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FollowerRepository extends JpaRepository<Follower, Long> {
    List<Follower> findByFollowedSeries(Series series);
}

