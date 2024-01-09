package com.study.ch12.b;
//패키지 차이로 import 발생
import com.study.ch12.a.Student;

public class BMain {
    public static void main(String[] args) {
        Student student = new Student(); //public -> default
        student.test();
    }
}
