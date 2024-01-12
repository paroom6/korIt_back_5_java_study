package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        //메서드 안에서 메서드를 정의 가능
        Runnable start = () -> { //매개변수가 없는 경우 () 필요
            System.out.println("프로그램 실행");
            System.out.println("데이터 초기화");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));
        };
        start.run();

        Supplier<Integer> supplier1 = () -> 10;
        int a = supplier1.get();
        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
  //      scannerInstance.get().nextInt();

        Consumer<String> setName = name -> {
            String newName = name + "님";
            System.out.println(newName);
        };
        setName.accept("조성민");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        strList.forEach(str -> System.out.println(str));
        Function<Integer, String> fx1 = num -> Integer.toString(num * num);
        System.out.println(fx1.apply(5));
        String result = fx1.andThen(num2 -> {
            System.out.println("andThen에 넣은 함수: " + num2);
            return "문자열 " + num2;
        }).apply(10);//fx1 실행 후 andThen 실행
        System.out.println(result);

        Function<Integer, Integer> fx2 = num -> {
           return num + 10;
        };

        String result2 = fx1.compose(fx2).apply(10); //compose 내의 함수부터 실행


        System.out.println(result2);
        System.out.println();

        System.out.println();
        String result3 = fx1.compose(num -> {
            System.out.println("fx2 실행");
            System.out.println("num: " + num);
            return (Integer) num;
        }).apply(10);
        System.out.println(result3);

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList.add(i + 1);
        }

        Predicate<Integer> filterFx = num -> num % 2 == 0;
        System.out.println(numList);
        List<Integer> newList = numList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());//카피 후 처음부터 끝까지 반복, 새로운 스트림에 저장.
        System.out.println(newList);//filter의 경우 Predicate 참 거짓으로 리턴, 리턴이 참일 경우 통과 아닐 경우 생략
        List<Integer> newList2 = newList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);//map의 경우  Function 매개변수와 리턴값 모두 존재: 현재의 경우 매개변수는 stream에서 받은 Integer,  리턴값은 함수의 리턴값인 Integer


    }
}
