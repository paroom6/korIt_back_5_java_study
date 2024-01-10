package com.study.ch14;

/*object 클래스
    *
    * */

public class ObjectMain { //모든클래스는 기본적으로 Object클래스를 상속받음
    public static void main(String[] args) {
        ObjectTest objectTest =  new ObjectTest("조성민", "부산");
        ObjectTest objectTest1 =  new ObjectTest("조성민", "부산");
        System.out.println(objectTest.toString());
        System.out.println(objectTest); //자동으로 toString이 호출된다.
        System.out.println(objectTest.equals(objectTest1));// 기본적으로 오버라이딩하면 같은 클래스내에 내용을 비교하는 메서드가 된다.
        System.out.println(objectTest == objectTest1); // ==과  기능이 같아 오버라이딩해서 사용한다.
        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());//객체를 통해 접근하는 경우 .getClass 를 사용한다.
        System.out.println(ObjectTest.class); //스태틱의 경우 .class 로 바로 접근가능

        System.out.println(objectTest.hashCode()); //실제메모리 주소
        System.out.println(objectTest1.hashCode()); // 오버라이딩의 경우 각각의 유니코드를 통해 나온 해쉬값을 합쳐 새로운 해쉬값을 만든다.


    }
}
