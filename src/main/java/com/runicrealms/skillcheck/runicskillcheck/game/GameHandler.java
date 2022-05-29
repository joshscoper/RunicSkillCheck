package com.runicrealms.skillcheck.runicskillcheck.game;

import com.runicrealms.skillcheck.runicskillcheck.RunicSkillCheck;

import com.runicrealms.skillcheck.runicskillcheck.reward.RewardEnum;
import org.bukkit.entity.Player;

public class GameHandler {

    private RunicSkillCheck runicSkillCheck;

    public GameHandler(RunicSkillCheck runicSkillCheck){
        this.runicSkillCheck = runicSkillCheck;
    }

    //Player Map

    public void addPlayer(Player player, GameType game){
        runicSkillCheck.getIngameMap().put(player, game);
    }

    public void removePlayer(Player player){
        runicSkillCheck.getIngameMap().remove(player);
    }

    public GameType getGameType(Player player){
        return (GameType) runicSkillCheck.getIngameMap().get(player);
    }

    public Boolean isPlayerIngame(Player player){
        if (runicSkillCheck.getIngameMap().get(player) != null){
            return true;
        }
        return false;
    }

    //Game Backend

    public void startGame(Player player, GameType gameType){
        addPlayer(player,gameType);
        //Game start logic
    }

    public void endGame(Player player, RewardEnum rewardEnum){
        removePlayer(player);
        if (isPlayerIngame(player)){
            //Game win logic
            rewardPlayer(player, rewardEnum);
        } else {
            //Game end logic
        }
    }

    public void rewardPlayer(Player player, RewardEnum reward){
        //Game reward logic
        switch (reward.getName()){
            case "item":
                break;
            case "exp":
                break;
            case "all":
                break;
        }
    }

    public boolean isPlayerWinner(Player player){
        //True logic
        return false;
    }

}
