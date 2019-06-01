package com.example.dharmendraverma.game;

public interface GameBuilder {

     void setGrideSize(int n, int m);

     void setPairSize(int p);

     void setTime(long time);

     void setDifficultyLevel(int level);

     GameDifficultyLevel getGameDifficultyLevel();
}
