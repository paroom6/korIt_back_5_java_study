package com.study.ch05;

import java.util.Scanner;

public class Swith01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("번호 선택: ");
        String num = scanner.next();

        switch (num) { //참,거짓뿐만 아니라 다른 자료형도 사용가능
           case "0":
               System.out.println("0선택");
               break;
           case "1":
               System.out.println("1선택");
               break;
           case "2":
               System.out.println("2선택");
               break;
            default:
                System.out.println("오류");
        }



    }
}
