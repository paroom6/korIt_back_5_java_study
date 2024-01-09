 package com.study.ch13;

/*
* Company클래스를 싱글톤을 적용하여 구현하시오
* */

public class Company {// 싱글톤: 유일한 객체를 하나만 만들때, 여러개 만들 필요가없을 때
    private static Company instance;
    private String name;

    private Company() {}

    public static Company getInstance() {
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

}
