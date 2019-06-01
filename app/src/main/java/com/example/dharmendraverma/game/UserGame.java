package com.example.dharmendraverma.game;

class UserGame {

    private GameBuilder gameBuilder;
    GameDifficultyLevel gameDifficultyLevel;

    public UserGame(GameBuilder gameBuilder) {
        this.gameBuilder = gameBuilder;
        GameDifficultyLevel gameDifficultyLevel = new GameDifficultyLevel();
        gameDifficultyLevel.setGameDifficultyLevel(gameDifficultyLevel);
    }

    public void getUserGame() {
        this.gameBuilder.getGameDifficultyLevel();
    }

    public void constructGame(int m, int n, int p, long time, int level) {
        this.gameBuilder.setGrideSize(m, n);
        this.gameBuilder.setTime(time);
        this.gameBuilder.setPairSize(p);
        this.gameBuilder.setDifficultyLevel(level);
    }


}
