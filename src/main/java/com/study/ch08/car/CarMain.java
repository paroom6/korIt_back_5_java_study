package com.study.ch08.car;

import com.study.ch08.Member.Member;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedMenu = null;
        boolean loopFlag = true;

        Car[] cars = new Car[3];
        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);


        while (loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료하기");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            if("1".equals(selectedMenu)) {
                System.out.println("<<< 자동차 관리 프로그램 >>>");
                String model = null;
                String color = null;


                if(carService.isFull()){
                    System.out.println("더 이상 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("모델명 >>> ");
                model = scanner.nextLine();
                System.out.print("색상 >>> ");
                color = scanner.nextLine();
                Car car = new Car(model, color);
                carService.append(car);


            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
                carService.printCarList();

            } else if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료중...");
                loopFlag = false;

            } else {
                System.out.println("다시 선택하세요.");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("<<<<<< 프로그램이 종료되었습니다. >>>>>>>");

    }
}
