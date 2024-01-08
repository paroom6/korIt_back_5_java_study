package com.study.ch09;

public class ElectronicDeivceMain {
    public static void main(String[] args) {
        ElectronicDeivce electronicDeivce = new ElectronicDeivce();
        ElectronicDeivce[]  electronicDeivces = new ElectronicDeivce[10];
        for (int i = 0; i < electronicDeivces.length; i++) {
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
                Computer computer = (Computer) electronicDeivces[i];
                computer.playGame();
            } else if (electronicDeivces[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDeivces[i];
                smartPhone.call();
            }

        }
        for (int i = 0; i < electronicDeivces.length; i++) {
            electronicDeivces[i].showDeviceState();
        }

    }

}
