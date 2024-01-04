package com.study.ch07.game;

import java.net.CacheResponse;
import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        GameServise gameServise = new GameServise();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------회원가입--------");
        System.out.print("아이디를 입력하세요: ");
        String userName = scanner.nextLine();
        if(gameServise.isEmpty(userName)){
            System.out.println("잘못된 값이 입력되었습니다.");
            System.out.println("다시 시작해주시기 바랍니다.");
            return;
        }
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();
        if(gameServise.isEmpty(password)){
            System.out.println("잘못된 값이 입력되었습니다.");
            System.out.println("다시 시작해주시기 바랍니다.");
            return;
        }
        System.out.print("닉네임을 입력하세요: ");
        String nickname = scanner.nextLine();
        if(gameServise.isEmpty(nickname)){
            System.out.println("잘못된 값이 입력되었습니다.");
            System.out.println("다시 시작해주시기 바랍니다.");
            return;
        }
        System.out.print("성인인증을 위한 나이를 입력하세요: ");
        int age = scanner.nextInt();
        if(gameServise.isAdult(age)){
            System.out.println("성인만 이용가능한 서비스입니다.");
            return;
        }
        Game game = new Game(userName, password, nickname, age);
        System.out.println();
        gameServise.ServiseToRepository(game);
    }
}
