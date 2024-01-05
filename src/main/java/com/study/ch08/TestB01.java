package com.study.ch08;

public class TestB01 {
    void add(int[] array, int x, int y) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                array[i] = x + y;
                break;
            }
        }

    }
    void showArrayDatas(int[] array){
        System.out.println("배열 값 확인");
        for (int i = 0; i < 2; i++) {
            System.out.printf("index[%d] >> %d \n",i,array[i]);
            System.out.println();
        }
    }
}
