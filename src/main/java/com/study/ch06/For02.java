package com.study.ch06;

import com.study.ch02.Person;

public class For02 {
    public static void main(String[] args) {
        /*
        * 0, 1, 2, 3, 4
        * */
        for(int i = 0; i<5; i++){
            System.out.print(i);
            if(i % 5 != 4) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i<10; i++){
            System.out.print(i);
            if(i % 5 == 4){
                System.out.println();
            }
            if(i % 5 != 4){
                System.out.print(", ");

            }


        }
        System.out.println();

        for(int i = 9; i>=0; i--){
            System.out.print(i);
            if (i % 5 == 0){
                System.out.println();
            }
            if(i % 5 != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        int n = 5;
        for(int i = 0; i < n; i++){
            int rv = n - 1 - i;
            System.out.print(rv);
            if(rv % 5 != 0){
                System.out.print(", ");
            }
        }

    }
}
