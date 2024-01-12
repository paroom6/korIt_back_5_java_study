package com.study.ch21;

public class ExceptionMain {

    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5};


        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(numArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 정상종료");

    }

}
