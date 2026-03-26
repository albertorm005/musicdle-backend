package com.musicdle.musicdle.repository;

import com.musicdle.musicdle.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {

    List<Score> findTop10ByOrderByPointsDesc();
}
