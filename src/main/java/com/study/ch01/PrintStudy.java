package com.study.ch01;

public class PrintStudy {
    public static void main(String[] args) {
        System.out.println(2 + 4);
        System.out.println("2 + 4");
        System.out.println("2");
        System.out.println(2);
        System.out.println("가나");
        System.out.println('\u0061');//16진수 사용 1~F까지 보통 색상표에서사용(예 #FFFFFF)
        System.out.println(""+'조'+'성'+'민'); //char의 경우 기본적으로 숫자, String이 있는경우 String을 우선
        System.out.println("나이: "+(10+20));

        //0000 0000 256가지 경우의 수 가장 앞의 비트 부호비트
        // char 자료형 -> 2바이트 unsigned 절대값-0~255 signed 0~127



    }
}
