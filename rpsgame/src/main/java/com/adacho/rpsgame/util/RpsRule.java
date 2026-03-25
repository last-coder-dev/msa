package com.adacho.rpsgame.util;

import java.util.HashMap;
import java.util.Map;

import com.adacho.rpsgame.enums.GameResult;
import com.adacho.rpsgame.enums.RockPaperScissors;

public class RpsRule {
  private static Map<RockPaperScissors, GameResult> userRock = new HashMap<>();
  private static Map<RockPaperScissors, GameResult> userPaper = new HashMap<>();
  private static Map<RockPaperScissors, GameResult> userScissors = new HashMap<>();
  public static Map<RockPaperScissors, Map<RockPaperScissors, GameResult>> checkMap = new HashMap<>();

  static {
    userRock.put(RockPaperScissors.PAPER, GameResult.LOST);
    userRock.put(RockPaperScissors.ROCK, GameResult.TIE);
    userRock.put(RockPaperScissors.SCISSORS, GameResult.WON);

    userPaper.put(RockPaperScissors.PAPER, GameResult.TIE);
    userPaper.put(RockPaperScissors.ROCK, GameResult.WON);
    userPaper.put(RockPaperScissors.SCISSORS, GameResult.LOST);

    userScissors.put(RockPaperScissors.PAPER, GameResult.WON);
    userScissors.put(RockPaperScissors.ROCK, GameResult.LOST);
    userScissors.put(RockPaperScissors.SCISSORS, GameResult.TIE);

    checkMap.put(RockPaperScissors.ROCK, userRock);
    checkMap.put(RockPaperScissors.PAPER, userPaper);
    checkMap.put(RockPaperScissors.SCISSORS, userScissors);
  }
}
