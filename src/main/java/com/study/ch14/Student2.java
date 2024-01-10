package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Student2 {
    private final String name;
    private String address;
    @NonNull//아래변수의 null을 허용하지 않는다
    private String phone; //상수가 아니기에 후에 변경가능

}
