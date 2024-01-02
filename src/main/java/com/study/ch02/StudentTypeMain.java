package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType s1 = new StudentType();
        s1.name="조성민";
        s1.studentYear=3;
        s1.address="양정동";
        System.out.println("이름: "+s1.name);
        System.out.println("학년: "+s1.studentYear+"학년");
        System.out.println("주소: "+s1.address);
        System.out.println();

        StudentType s2 = new StudentType();
        s2.name="성민조";
        s2.studentYear=5;
        s2.address="부산진구";
        System.out.println("이름: "+s2.name);
        System.out.println("학년: "+s2.studentYear+"학년");
        System.out.println("주소: "+s2.address);
        System.out.println();

        StudentType s3 = new StudentType();
        s3.name="민성조";
        s3.studentYear=2;
        s3.address="양정1동";
        System.out.println("이름: "+s3.name);
        System.out.println("학년: "+s3.studentYear+"학년");
        System.out.println("주소: "+s3.address);
        System.out.println();
        //자료형의 포함관계에 유의
        Person p = s1; //더 큰 Person으로 s1의 값을 업캐스팅
        StudentType s4 = (StudentType) p;//다운캐스팅시 명시적 형변환 필요
//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;

        StudentType 전주환학생 = new StudentType();
        Person 전주환 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환;
        //업캐스팅한 자료를 다운캐스팅가능하지만 처음부터 상위 개념의 클래스는 다운 캐스팅 불가
        //String, Boolean은 참조자료형으로 캐스팅 불가
    }
}
