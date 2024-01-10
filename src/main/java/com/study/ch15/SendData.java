package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class SendData<T> {//알파벳 자체는 사용하는 변수의 종류를 의미하는 편이다.
    private int code;//여러개의 타입을 받을 수 있다 다만 그럴 경우 생성시 제네릭 타입을 모두 선언해야한다.제네릭 타입으로 일반자료형 사용불가
    private T data;

    public void send() {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }

}
