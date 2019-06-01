package com.example.dharmendraverma.game;

public class Game implements ScoreBuilder {

    UserGame userGame;
    UserScore userScore;

    @Override
    public void setGame(UserGame game) {
        this.userGame = userGame;
    }

    @Override
    public void setScore(UserScore uSerScore) {
        this.userScore = uSerScore;
    }

}
