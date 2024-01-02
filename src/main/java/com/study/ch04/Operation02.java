package com.study.ch04;

public class Operation02 {
    public static void main(String[] args) {
        /*
        * <<연산자>>
        *
        * 산술연산자
        * 비교연산자
        * 논리연산자
        * 조건연산자
        * 복합대입연산자
        *  */
        boolean flag=true;
        System.out.println(true);
        System.out.println(false);
        System.out.println("비교연산자");//true,false
        System.out.println("10 >2 = "+(10 > 2));
        System.out.println("10 < 2 = "+(10 < 2));
        System.out.println("10 >= 10 = "+(10 >= 10)); //일반적으로 잘 안쓰임, 0에서 시작하기에 0~n의 경우 n+1 횟수가 되어 복잡해진다.
        System.out.println("10 <= 2 = "+(10 <= 2));
        System.out.println("10 == 2 = "+(10 == 2));
        System.out.println("10 != 2 = "+(10 != 2));

        System.out.println("논리연산자");
        System.out.println("");


    }
}
