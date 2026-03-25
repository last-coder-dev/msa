package com.adacho.leaderboard.event;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class RpsSolvedEvent implements Serializable {
  private final Long rpsChallengeId;
  private final Long userId;
  private final String alias;
  private final String outcome;

  RpsSolvedEvent() {
    this.rpsChallengeId = 0L;
    this.userId = 0L;
    this.alias = null;
    this.outcome = null;
  }
}
