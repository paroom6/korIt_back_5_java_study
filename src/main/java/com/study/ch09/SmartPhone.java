package com.study.ch09;

public class SmartPhone extends ElectronicDeivce{
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");
    }

    @Override //@로 시작하면 어노테이션 오버라이딩을 구분하기 위해서 + 하나의 기능을 함축적으로 쓸 때
    void showDeviceState() {
        System.out.print("스마트폰 ");
        super.showDeviceState();
    }
}
