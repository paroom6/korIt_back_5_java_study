package com.study.ch07.game;

public class GameServise {
    boolean isEmpty(String str){
        if(str == null){
            return true;
        }
        return str.isEmpty();
    }
    boolean isAdult(int age){
        if(age == 0 ||age <19){
            return true;
        }
        return false;
    }
    void ServiseToRepository(Game game){
        System.out.println("정보가 서비스에 도착했습니다.");
        System.out.println();
        GameRepository gameRepository = new GameRepository(game);

    }

}
