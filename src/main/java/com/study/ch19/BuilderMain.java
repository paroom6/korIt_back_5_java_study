package com.study.ch19;

import java.util.Locale;

public class BuilderMain {

    public static void main(String[] args) {

    Car car = new Car("아반떼", "블랙");
//    Car car2 = Car.builder()
//            .color("블랙").model("아반떼")//. 후 원하는 값을 선택해서 입력
//            .build(); //Car.builder(): 스태틱메소드  .build: Car.builder의 주소를 참조하는 메소드
        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Car.CarBuilder carBuilder1 = Car.builder();
        Car car2 = Car.builder().model("아반떼").color("블랙").build();
        System.out.println(car2);


        Student student = Student.builder()
                .name("조성민")
                .age(25)
                .build();
        System.out.println(student);
        Member member =new Member("조성민", "01034053728"); //builer에는 AllArgsConstructor가 포함되어 있다.

    }

}
