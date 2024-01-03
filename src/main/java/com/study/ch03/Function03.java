 package com.study.ch03;

public class Function03 {//함수 1. 재사용이 용이하게 2. 코드의 간결성,가독성을 위해(클린코드)
        public static int fx03() {
            System.out.println("fx03 실행");
            return 100;
        }

        public static String fx04(String name, int age){
            return name + ", " + age;
        }


    public static void main(String[] args) {
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("조성민",24);
        System.out.println(result);

    }


}
