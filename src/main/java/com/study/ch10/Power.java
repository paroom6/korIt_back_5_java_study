package com.study.ch10;

public interface Power { //abstract 생략됨, 추상메서드만 가능
    //boolean powerState; // 모든 자료는 상수만 가능
    String ERROR_CODE = "-9999"; // 에러코드 같이 변하지 않는 경우만 사용
    void setPowerOn();
    void setPowerOff();

    default void test(){// defalt를 통해 일반메서드 생성가능

    }

}
