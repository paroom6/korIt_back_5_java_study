package com.study.ch12.a;

import javax.net.ssl.SSLServerSocket;

public class AMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("조성민");
        System.out.println(student.getName());
        student.setAddress("Busan");
        System.out.println(student.getAddress());
        System.out.println(student.toString());
    }
}
