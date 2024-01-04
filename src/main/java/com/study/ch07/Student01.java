package com.study.ch07;

public class Student01 {
    String name;
    int age;
//  String address;
    final String address; //생성될 때 무조건 선언되어야 한다. 필수값을 받을때 사용
//  생성자 constructor
    //args(arguments) 매개변수
    //생성자는 기본적으로 생략가능하지만 하나라도 생성자를 선언하면 따로 NoArgsCons를 선언해야한다.
    // NoArgsConstructor
//    Student01(){
//        address = "";
//    }

    // AllArgsConstructor
    Student01(String name,int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //RequiredArgsConstructor
    Student01(String address){
        this.address = address;
    }


}
