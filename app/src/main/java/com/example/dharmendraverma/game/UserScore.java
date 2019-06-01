package com.example.dharmendraverma.game;

public class UserScore implements ScoreBuilder {

    private UserGame userGame;
    private UserScore userScore;

    @Override
    public void setGame(UserGame game) {
        this.userGame = game;
    }

    @Override
    public void setScore(UserScore userScore) {
        this.userScore = userScore;
    }
}
