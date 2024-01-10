package com.study.ch14;

import java.util.Objects;
import java.util.Scanner;

/*object 클래스
    *
    * */
//      Object o = new Object();//Object 또한 하나의 클래스
//      String str = new String(); //java.lang 안의 클래스는 import 없이 사용가능
//      System.out.println();
//      Scanner scanner = new Scanner(System.in);
public class ObjectTest { //모든클래스는 기본적으로 Object클래스를 상속받음
    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //현재클래스와 매개변수의 클래스가 같지않다면
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address); //기본클래스에 s를 붙이면 관련메소드를 모은 클래스가 된다.
    }                                                                                    //도구들은 클래스명.메서드인 스태틱메서드의 형태를 이루고 있다.



    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    } //해쉬코드로 비교하면 클래스가 달라도 값만 같으면 같다고 본다.
}
