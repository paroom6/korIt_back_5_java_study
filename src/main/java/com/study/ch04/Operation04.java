package com.study.ch04;

import java.util.Scanner;

public class Operation04 {
    public static void main(String[] args) {
        /*
        *
        * 연도가 주어졌을 때 윤년이면 true 아니면 false을 출력하는 프로그램 작성
        * 윤년은 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일 때이다.
        * 년도는 0보다 크고 4001보다 작은 자연수이다
        *  */

        int year = 2000;
        boolean step1 = year > 0;
        boolean step2 = year <4001;
        boolean step3 = year % 4 == 0;
        boolean step4 = year % 100 != 0;
        boolean step5 = year % 400 == 0;
        boolean stepResult = step1 && step2 && (step3 && step4 || step5);// 괄호가 없는 경우 step 5에서 조건을 벗어난 년도가 true가 되는 경우가 존재 >> 괄호 처리로 연산순서를 변경
        boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year > 0 && year < 4001; //년도 조건을 먼저 연산 후 범위 조건 연산

        System.out.println("결과 => " + stepResult);
        System.out.println("결과 => " + result);




    }
}
