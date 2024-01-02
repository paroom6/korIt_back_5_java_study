package com.study.ch02;

public class ConstantMain {
    public static void main(String[] args) {
        //Constant 일정한 상수
        // 대문자로만 표기, 두개 이상의 단어가 합쳐진 경우_로 구분(스네이크 표기법)
        // 최초  한번만 대입가능
        // 무조건 초기화가 되어야한다.
        final String FILE_PATH = "c:/aws/project"; // 선언하면 값을 바꿀 수 없는 상수
        //path = "c:/aws/project"; 대입가능한 변수
    }
}
