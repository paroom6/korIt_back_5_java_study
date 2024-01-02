package com.study.ch04;

public class Operation03 {
    public static void main(String[] args) {
        /*
        * <<연산자>>
        *
        * 산술연산자
        * 비교연산자
        * 논리연산자
        * && and -곱  1&&1=1 1&&0=0 0&&0=0
        * || or  -합  1||1=1 1||0=1 0||0=0
        * !  not -부정  !1=0   !0=1
        * true (1)
        * false(0)
        * 조건연산자
        * 복합대입연산자
        *  */

        System.out.println("논리연산자");
        System.out.println("505 % 5 == 0 && 505 % 50 != 0 : "+(505 % 5 == 0 && 505 % 50 != 0));
        System.out.println("505 % 5 == 0 || 505 % 50 == 0 : "+(505 % 5 == 0 || 505 % 50 == 0));
        System.out.println("!(505 % 5 == 0 || 505 % 50 == 0) : "+!(505 % 5 == 0 || 505 % 50 == 0));
        int age = 30;
        System.out.println(age > 20 && age < 40 && age != 30);//항상 비교대상이 앞으로 가게 작성


    }
}
