package com.study.ch02;

public class Variable {
    public static void main(String[] args) {

        /*
        * 10 + 20
        * 10과 20 모두 컴퓨터가 인식할 수 있는 값이 os에 존재함
        * (리터럴)상수 이미 렘에 고정된 주소를 할당 받은 값들
        * 변수 렘에 무작위 주소를 할당받은 공간
        * int date =10; 대입
        * int date2 = date;
        * date의 주소 300 - 변수 date에 접속하는 주소
        * 상수 10의 주소 100 - 상수값 10의 위치를 나타내는 주소
        * date2는 변수 date를 지정하기에 date가 지정하는 값이 변함에 따라 같이 변화한다.
        * c언어의 경우
        * {int a = 20;
        *  int p = &a(100이라 가정); 주소를 담을 수 있는 포인터 변수
        * }
        * {int a=10;
        *  int b=100;
        *  *b->20 /// *의 경우 주소의 내용을 불러낸다.
        * }
        * */
        int date = 20231230; //동일한 형태를 담기위함
        double date2 =date; //실수는 정수를 포함함
         int date3 = (int) date2; //역은 불가 - 데이터 형변환:다운 캐스팅의 경우에만
        /*
        * 업 캐스팅 int ->double 작은 자료형에서 큰 자료형으로 올 경우, 자동 형변환된다.
        * 다운 캐스팅 double ->int 크기가 큰 자료형에서 작은 자료형으로 올 경우
        * */
        //문자->정수->실수
        char a = '1';
        int b=a;
        double c = b;
        /*객체 : 자료형을 내가 만드는 것
        * */

        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);
        System.out.println(date + 6);
        System.out.println(date + 7);
        System.out.println(date + 8);
        System.out.println(date + 9);
    }
}
