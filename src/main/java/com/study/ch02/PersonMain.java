package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();//Person이라는 변수선언, 이미 존재하는 자료형과 달리 우리가 만들어야한다.
        p.name="조성민";//.을 통해 참조(참조자료형)
        p.age=23;
        //Person p2 = null;//참조가 불가능한 상태
        //p2.name="성민";
        //p2.age=24;
        String name1 = "조성민";//이미 존재하는 객체를 가리키는 주소
        String name2 = new String("조성민");//새로운 주소 생성 그 주소가 지정된 객체를 지정
        String name3 = "조성민";
        String name4 = null;

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1==name2);// 주소를 비교하기에 false
        System.out.println(name1==name3);// 같은 주소를 지정하기에 true
        System.out.println(name1=="조성민");//
        System.out.println(name2=="조성민");//
        System.out.println(name1.equals(name2));//문자열 간 내용 비교
        //System.out.println(name4.equals("조성민")); null이기에 .equals 사용자체가 불가
        System.out.println("조성민".equals(name4));//"조성민"은 String객체이기 때문에 .equals 사용가능
        /*
        *
        * */

    }
}
