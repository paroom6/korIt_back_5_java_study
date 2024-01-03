package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
        * 이름: 조성민
        * 나이: 24
        * 연락처: 01000000000 //문자열
        * 학년
        * 주소:부산진구
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.next();
        System.out.print("나이: ");
        int age = scanner.nextInt();
        System.out.print("연락처: ");
        String phone_num = scanner.next();
        System.out.print("학년: ");
        int grade = scanner.nextInt();
        scanner.nextLine();//nextLine의 경우 enter까지 입력되어 넘어가기에 임의로 삽입
        System.out.print("주소: ");
        String addr = scanner.nextLine();
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone_num);
        System.out.println("학년: " + grade);
        System.out.println("주소: " + addr);

    }
}
