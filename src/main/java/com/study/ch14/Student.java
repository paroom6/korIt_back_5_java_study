package com.study.ch14;

import lombok.*;
@AllArgsConstructor
@Data //아래 어노테이션을 포함
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
public class Student {
    private String name;
    private String phone;
    private String address;
    private int age;


}
