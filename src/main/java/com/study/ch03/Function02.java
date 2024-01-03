package com.study.ch03;

public class Function02 {//함수 1. 재사용이 용이하게 2. 코드의 간결성,가독성을 위해(클린코드)

    //매개변수, 리턴 X
    private static void fx01(){
        System.out.println("fx01 함수 실행");
        System.out.println();
    }
    //매개변수 O
    private static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }
    public static void  fx02(String name , int age){
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        fx01();
        fx02(25, "조성민");
    }


}
