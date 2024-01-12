package com.study.ch13;

public class Factory {
    //자기자신 클래스를 스태틱변수(변수명: instance)로 가지고 있어야한다.
    private static Factory instance;
    private String factoryName;
    private int autoCount;
    private final int DEFAULT_NUMBER = 20240000;
    private Factory() {}//생성자를 private으로 외부생성을 막는다.
    public static Factory getInstance() { //싱글톤: 객체의 인스턴스가 단 하나만 생성되는 것
        if(instance == null) {//인스턴스 객체를 하나만 만들기 위함
            instance = new Factory();
        }
        return instance;
    }
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Car produce(String model) {
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUMBER + autoCount), model);  //String.valueOf(DEFAULT_NUMBER + autoCount)
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                '}';
    }
}
