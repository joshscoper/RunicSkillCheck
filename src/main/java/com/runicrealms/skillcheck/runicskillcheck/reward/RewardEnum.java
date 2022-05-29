package com.runicrealms.skillcheck.runicskillcheck.reward;

public enum RewardEnum {

    ITEM("item"),
    EXP("exp"),
    ALL("all");

    private final String name;

    RewardEnum(String name) {
        this.name = name;
    }

    /**
     * Formats the Reward w/ an uppercase first letter for display purposes.
     *
     * @return the formatted name
     * 100% stole this from Professions
     */
    public String getName() {
        return this.name.substring(0, 1).toUpperCase() + this.name.substring(1);
    }
}
