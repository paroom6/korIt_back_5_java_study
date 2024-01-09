package com.study.ch13;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Factory factory = new Factory(); //넘겨줄 매개변수의 수가 많아진다.
        FactoryService1 factoryService1 = new FactoryService1(scanner);
        FactoryService2 factoryService2 = new FactoryService2(scanner);

        factoryService1.create();
        factoryService2.create();



    }

}
