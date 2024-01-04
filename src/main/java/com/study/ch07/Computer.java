package com.study.ch07;

import java.sql.Struct;

public class Computer {
        String type;
        String cpu;
        String ram;
        String disk;
        //생성자
        // 클래스명과 동일하다
        // 메소드의 형태이다.

        Computer() {//무조건 주소값을 리턴하기에 리턴 자료형,값이 없다.
                System.out.println("컴퓨터 하나 생성");
                type = "컴퓨터";
        }
        Computer(String type) { // 같은 변수명 사용 가능
                System.out.println(type + " 하나 생성");
                this.type = type;//this의 경우 생성된 인스턴스의 주소를 가르켜 필드의 변수에 값을 준다
                //super의 경우 부모 클래스의 주소를 가르킨다.

        }

        void showInfo() { //클래스 안에 선언된 함수는 메소드라 함 - 자바에는 함수가 아닌 모두 클래스 안의 메소드이다
                System.out.println("type: " + type);
                System.out.println("cpu: " + cpu);
                System.out.println("ram: " + ram);
                System.out.println("disk:" + disk);
        }

}
