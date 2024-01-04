package com.study.ch07.game;

public class GameRepository {
    GameRepository(Game game){
        GameDB gameDB = new GameDB();
        gameDB.InsertGameDB(game);
    }
}
