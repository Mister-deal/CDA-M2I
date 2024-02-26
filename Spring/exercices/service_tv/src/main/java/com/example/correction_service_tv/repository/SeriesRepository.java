package com.example.correction_service_tv.repository;

import com.example.correction_service_tv.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
@RepositoryRestResource(collectionResourceRel = "series", path = "series")
public interface SeriesRepository extends JpaRepository<Series, Long> {
    List<Series> findByGenre(String genre);
    List<Series> findByStatus(String status);
}
