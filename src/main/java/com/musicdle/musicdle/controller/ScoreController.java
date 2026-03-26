package com.musicdle.musicdle.controller;

import com.musicdle.musicdle.model.Score;
import com.musicdle.musicdle.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/scores")
@CrossOrigin
public class ScoreController {

    @Autowired
    private ScoreRepository repo;

    @PostMapping
    public Score saveScore(@RequestBody Score score) {
        score.setDate(LocalDateTime.now());
        return repo.save(score);
    }

    @GetMapping
    public List<Score> getScores() {
        return repo.findTop10ByOrderByPointsDesc();
    }
}