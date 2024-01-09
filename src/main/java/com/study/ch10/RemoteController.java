package com.study.ch10;

public class RemoteController extends  ElectronicDeivce{
    @Override
    void showDeviceState() { //추상 메서드는 무조건 재정의 해야함 혹은 추상클래스에 상속받아 추상클래스와 추상메소드를 매칭시킨다.
        System.out.println("리모컨 상태 확인");
    }
    //이후로 일반클래스와 동일
}
