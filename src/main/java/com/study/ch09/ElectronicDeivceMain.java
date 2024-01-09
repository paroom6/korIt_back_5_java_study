package com.study.ch09;

public class ElectronicDeivceMain {
    public static void main(String[] args) {
        ElectronicDeivce electronicDeivce = new ElectronicDeivce();
        ElectronicDeivce[]  electronicDeivces = new ElectronicDeivce[10];
        for (int i = 0; i < electronicDeivces.length; i++) {
            //업캐스팅 자식클래스를 부모클래스로 생성, 부모클래스의 필드,메소드만 사용가능
            // 자식클래스에서 오버라이딩한 메소드는 오버라이딩 된 상태이다
            electronicDeivces[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }
        for (int i = 0; i < electronicDeivces.length; i++) {
            electronicDeivces[i].showDeviceState();
        }
        System.out.println();

        for (int i = 0; i < electronicDeivces.length; i++) {
            electronicDeivces[i].setPowerOn();
        }

        for (int i = 0; i < electronicDeivces.length; i++) {
            electronicDeivces[i].showDeviceState();
        }
        for (int i = 0; i < electronicDeivces.length; i++) {
            if(electronicDeivces[i] instanceof Computer){ // 자바 17정도부터 키워드 삭제 Class class getClass class명.class
                Computer computer = (Computer) electronicDeivces[i]; //다운캐스팅 업캐스팅을 복구하는 과정이라 생각하면 된다.
                computer.playGame();
            } else if (electronicDeivces[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDeivces[i];
                smartPhone.call();
            }

        }
        for (int i = 0; i < electronicDeivces.length; i++) {
            electronicDeivces[i].showDeviceState();
        }
        ElectronicDeivce electronicDeivce3 = new Computer();
        electronicDeivce3.showDeviceState();
        //electronicDeivce3.playGame();
        Computer computer = (Computer) electronicDeivce3;
        computer.showDeviceState();
        computer.playGame();
        Computer computer1 = new Computer();
        computer1.playGame();
        ElectronicDeivce electronicDeivce1 = (ElectronicDeivce) computer1;
        electronicDeivce1.showDeviceState();

    }

}
