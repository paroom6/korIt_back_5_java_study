package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user01 = new User01("aaaa145", "1234");
        User01 user02 = new User01("abcd134", "4567", "조성민", "abcd@naver.com");
        user01.setName("조희성");
        user01.setEmail("wh@naver.com");
        user01.showInfo();
        user02.showInfo();
    }
}

