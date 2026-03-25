package com.adacho.leaderboard.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class LeaderBoardRow {
  private final Long userId;
  private final String alias;
  private final Long totalScore;
}
