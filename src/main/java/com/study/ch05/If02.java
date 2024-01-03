package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x와 y의 좌표를 입력하세요(띄어쓰기로 구분): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x == 0 || y == 0){
            System.out.println("오류");
        } else if (x > 0 && y > 0){
            System.out.println("제 1사분면");
        } else if (x < 0 && y > 0){
            System.out.println("제 2사분면");
        } else if (x < 0 && y < 0){
            System.out.println("제 3사분면");
        } else System.out.println("제 4사분면");

    }
}
