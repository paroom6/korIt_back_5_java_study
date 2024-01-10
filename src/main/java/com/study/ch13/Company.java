 package com.study.ch13;

/*
* Company클래스를 싱글톤을 적용하여 구현하시오
* */

public class Company {// 싱글톤: 유일한 객체를 하나만 만들때, 여러개 만들 필요가없을 때
    private static Company instance; // 바로 객체를 초기화한 경우 만약 실행당시 메모리에 할당할 공간이 없다면 실행이 안되기에 getInstance로 선언시 초기화
    private String name;

    private Company() {}

    public static Company getInstance() {
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

}
