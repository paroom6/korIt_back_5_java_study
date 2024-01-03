package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        //조건문
        int i = 0;

        if(i > 3) {
            System.out.println("i가 3보다 큽니다");
            System.out.println("if문 종료");
        } else if (i == 3) {
            System.out.println("i는 3입니다.");
        } else System.out.println("i가 3보다 작습니다."); //else 뒤에 하나의 문장만 올 경우 중괄호 생략가능

        /*
        * if() {
        *
        * } else {
        *   if() {
        *
        *   } else {
        *
        *   }
        * }
        * 위 의 형식에서 else와 if 사이의 중괄호를 생략, 들여쓰기 함
        * */

        String tempStr = i > 3 ? print("i가 3보다 큽니다.") : ""; //tempStr에 들어 올 String의 return값이 존재
        //String tempStr1 = i > 3 ? println("i가 3보다 큽니다.") : "";  tempStr1에 들어 올 return 값이 없다.

    }
    public static String print(String str) {
        System.out.println(str);
        return str;
    }
}
