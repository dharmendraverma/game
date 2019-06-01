package com.example.dharmendraverma.game;

public class GameDifficultyLevel implements GameBuilder {

    int m;
    int n;
    int p;
    long time;
    int level;
    GameDifficultyLevel gameDifficultyLevel;

    @Override
    public void setGrideSize(int n, int m) {
        this.m = m;
    }

    @Override
    public void setPairSize(int p) {
        this.p = p;
    }

    @Override
    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public void setDifficultyLevel(int level) {
        this.level = level;
    }

    @Override
    public GameDifficultyLevel getGameDifficultyLevel() {
        return gameDifficultyLevel;
    }

    public void setGameDifficultyLevel(GameDifficultyLevel gameDifficultyLevel){
        this.gameDifficultyLevel = gameDifficultyLevel;
    }

}

