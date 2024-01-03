package com.study.ch06;

import java.lang.invoke.MethodHandles;

public class For01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { //반복횟수가 정해져있고 일정한 간격으로 증감할 때, 반복횟수가 중심일 때
            System.out.println("i: " + i);
        }
        int i = 0;
        while (true){//조건이 중심일 때
            System.out.println(i);
            i++;

        }



    }
}
