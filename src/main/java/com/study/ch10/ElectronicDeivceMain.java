package com.study.ch10;

public class ElectronicDeivceMain {
    public static void main(String[] args) {

         ElectronicDeivce electronicDeivce = new ElectronicDeivce() {//추상클래스는 일반적으로 생성불가
         @Override //익명클래스
            void showDeviceState() {// 추상매서드를 익명클래스로 구현한 경우 생성가능
                System.out.println("첫번째 기기 확인");
            }
        };

         RemoteController remoteController = new RemoteController();// 상속을 통해서 명확한 실체가 생긴 상태에서 생성가능
        // 객체생성은 이름의 선언에 발생
         ElectronicDeivce electronicDeivce2 = new ElectronicDeivce() {
             @Override
             void showDeviceState() {
                 System.out.println("두번째 기기확인");
             }
         };

         ElectronicDeivce[] electronicDeivces = new ElectronicDeivce[3];
         electronicDeivces[0] = electronicDeivce;
         electronicDeivces[1] = electronicDeivce2;
         electronicDeivces[2] = remoteController;
         for (int i = 0; i < 3; i++) {
             electronicDeivces[i].showDeviceState();
         }


    }
}
