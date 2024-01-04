package com.study.ch07.game;

public class GameDB {
    void InsertGameDB(Game game){
        System.out.println("데이터베이스에 정보를 저장합니다.");
        System.out.println();
        System.out.println("저장내용");
        System.out.println("아이디: " + game.userName);
        System.out.println("비밀번호: " + game.password);
        System.out.println("닉네임: " + game.nickname);
        System.out.println("나이: " + game.age);
    }

}
