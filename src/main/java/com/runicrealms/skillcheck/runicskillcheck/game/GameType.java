package com.runicrealms.skillcheck.runicskillcheck.game;

public enum GameType {
    SWEEPER("sweeper"),
    SEQUENCE("sequence"),
    CLICKER("clicker"),
    MATCH("match");


    private final String name;

    GameType(String name) {
        this.name = name;
    }

    /**
     * Formats the Game Type w/ an uppercase first letter for display purposes.
     *
     * @return the formatted name
     * 100% stole this from Professions
     */
    public String getName() {
        return this.name.substring(0, 1).toUpperCase() + this.name.substring(1);
    }
}
