package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        TestB01 bClass = new TestB01();
        int nums[] = new int[3];
        bClass.add(nums, num1, num2);
        bClass.add(nums, 20, 40);
        bClass.showArrayDatas(nums);
        int arr[] = {};
        String binomial = "43 + 12";
        String arr1[] = binomial.split(" ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println();
    }
}
