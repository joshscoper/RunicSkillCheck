package com.runicrealms.skillcheck.runicskillcheck;

import com.runicrealms.plugin.RunicCore;
import com.runicrealms.plugin.api.RunicCoreAPI;
import com.runicrealms.runicitems.RunicItemsAPI;
import com.runicrealms.runicrestart.api.RunicRestartApi;
import com.runicrealms.skillcheck.runicskillcheck.game.GameHandler;
import com.runicrealms.skillcheck.runicskillcheck.game.GameType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class RunicSkillCheck extends JavaPlugin {

    private static Plugin plugin;

    //API Registry
    private RunicCore runicCore;
    private RunicCoreAPI runicAPI;
    private RunicRestartApi runicRestartApi;
    private RunicItemsAPI runicItemsAPI;

    //Instance Map
    private HashMap<Player, GameType> ingame = new HashMap();

    //GameHandler Init
    private GameHandler gameHandler;

    public void initRunic(){
        plugin = this;
        runicCore = RunicCore.getInstance();
        runicAPI = new RunicCoreAPI();
        runicRestartApi = new RunicRestartApi();
        runicItemsAPI = new RunicItemsAPI();
        gameHandler = new GameHandler(this);
    }


    public void registerCommands(){}

    public void registerEvents(){}

    @Override
    public void onEnable() {
        // Plugin startup logic
        initRunic();
        registerCommands();
        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public Plugin getPlugin(){return plugin;}

    public RunicCore getRunicCore(){return runicCore;}
    public RunicCoreAPI getAPI(){return runicAPI;}
    public RunicRestartApi getRunicRestartApi(){return runicRestartApi;}
    public RunicItemsAPI getRunicItemsAPI(){return runicItemsAPI;}

    public HashMap getIngameMap(){return ingame;}
    public GameHandler getGameHandler(){return gameHandler;}

}
