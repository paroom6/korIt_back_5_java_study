package com.study.ch14;


public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("조성민","01034053728","진구", 24);
        System.out.println(student);
        Student2 student2 = new Student2("조성민", "01034053728");
        //생성~소멸: 라이프사이클을 확인

    }

}
