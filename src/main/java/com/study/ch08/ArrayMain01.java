package com.study.ch08;

import java.util.Scanner;

public class ArrayMain01 {

    public static void main(String[] args) {
        //배열(Array)
        /*
        *  자바의 경우 변수의 데이터가 메모리에 순차적으로 저장되지 않는다.
        *  = 대입연산자가 나오는 경우 무조건 변수가 있다. - 자료형과 값이 따라온다.
        *  new 생성자 = 동적(힙) 메모리 할당  - 메모리 공간 대여
        *
        *
        *
        *
        * */
        int num1 = 10;
        int num2 = 20;
        int[] numArray; //선언
        numArray = new int[3]; //값(주소) 대입
        System.out.println(numArray);
        System.out.println(numArray[0]);
        numArray[0] = 10;
        System.out.println(numArray[0]);
        numArray[1] = 20;
        numArray[2] = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.print("인덱스: ");
        int index = scanner.nextInt();
        System.out.println(numArray[index]);









//        //배열 크기 확장?
//        int arr[] = new int[3];
//        arr[0] = 0;
//        arr[1] = 1;
//        arr[2] = 2;
//
//        int arr2[] = new int[4]; //값을 담을 새로운 배열
//        for(int i = 0; i < 3; i++){
//            arr2[i] = arr[i];
//            arr2[3] = 3;
//        }
//        arr = arr2; // 값 대입
//        arr2 = null;//메모리 반납을 위한 null
//        for(int i = 0; i < 4; i++){ // 변경된 배열
//            System.out.println(arr[i]);
//        }
    }

}
