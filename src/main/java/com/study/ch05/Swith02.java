package com.study.ch05;

import java.util.Scanner;

public class Swith02 {
    public static boolean select() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("여기서 멈출까요(y/n)?");
        String value = scanner.next();

        for (int i = 0; i < 10; i++) {
            String a = "조성민";
        }
        for (int i = 0; i < 10; i++) {
            String a = "조성민";
        }
        return "y".equals(value) || "Y".equals(value);
    }

    public static void main(String[] ar6gs) {
        int num = 1;

        System.out.println("게임 시작");
        switch (num) {
            case 1:
                System.out.println("1단계 시작");
                if(select()){
                    break;//
                }
            case 2:
                System.out.println("2단계 시작");
                if(select()){
                    break;
                }
            case 3:
                System.out.println("3단계 시작");
                if(select()){
                    break;
                }
            case 4:
                System.out.println("4단계 시작");
                if(select()){
                    break;
                }
            case 5:
                System.out.println("마지막단계 시작");
        }

    }
}
