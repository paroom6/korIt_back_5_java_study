package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        /*
        * 역순 별
        *
        * 대칭 별
        *    *
        *   ***
        *  *****
        * *******
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("별 몇개?");
        int star = scanner.nextInt();
        for (int i = 0; i < star; i++) {//정방향
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < star; i++) {//상하대칭
            for (int j = 0; j < star - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < star; i++) {//좌우대칭
            for (int j = 0; j < star-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < star; i++) {//상하좌우대칭
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < star; i++) {//트리

                for(int j = 0; j < (star - i - 1); j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

