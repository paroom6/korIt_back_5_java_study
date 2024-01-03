package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("타이틀: ");
        String title = scanner.nextLine(); //띄어쓰기 이후 엔터 자체를 인식해서 넘어감


        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        System.out.println(title + ": " + (a + b + c));



    }
}
