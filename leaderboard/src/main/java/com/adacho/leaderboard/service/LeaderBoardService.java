package com.adacho.leaderboard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adacho.leaderboard.domain.LeaderBoardRow;
import com.adacho.leaderboard.repository.ScoreCardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LeaderBoardService {
  private final ScoreCardRepository scoreCardRepository;

  public List<LeaderBoardRow> getCurrentLeaderBoard() {
    return scoreCardRepository.findFirst10();
  }
}
