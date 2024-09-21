package com.futurelabs.annotation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

class GameCharacter {

    @NotNull
    private String login;

//    @Range(min = 1, max = 100)
    @Range(from = 1, to = 100)
    private int level = 1;

    public GameCharacter(
            @NotNull String login,
//            @Range(min = 1, max = 100) int level) {
            @Range(from = 1, to = 100) int level) {

        this.login = login;
        this.level = level;
    }

    @NotNull
    public String getLogin() {
        return login;
    }

    //    @Range(min = 1, max = 100)
    @Range(from = 1, to = 100)
    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "login='" + login + '\'' +
                ", level=" + level +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        GameCharacter game = new GameCharacter("mguarniz", 101);
        System.out.println(game);
    }
}