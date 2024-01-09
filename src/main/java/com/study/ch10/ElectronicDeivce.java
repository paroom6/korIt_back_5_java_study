package com.study.ch10;

public abstract class ElectronicDeivce {
    /*
        [추상화] // 공통점을 뽑아낸다.
    1. 추상클래스 abstract class
        일반 클래스와 유사한 구조 일반 메서드 추상메서드 모두 가능
        생성만 되지 않는다.
        이미 있는 클래스를 재활용 하는 경우
    2. 인터페이스 interface
        변수선언 불가, 기본적으로 추상메서드 선언
        다중상속 가능
        인터페이스의 기능들을 합쳐 새로운 클래스 생성
     */
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }
    void setPowerOff() {
        powerState = false;
    }

    abstract void showDeviceState();
        //추상 메서드 인터페이스와 추상클래스만 정의 가능, 상속받을시 반드시 재정의해야함, 리턴변수 메서드명 매개변수만 선언
        //매번 재정의하면 내용이 필요하지 않다.

}
