package com.study.ch03;

public class Function01 {//함수 1. 재사용이 용이하게 2. 코드의 간결성,가독성을 위해(클린코드)
    public static void main(String[] args) {//main 또한 일종의 함수
        fx3();
        System.out.println(fx1(1,2,3,4,5));//함수호출(콜)
        fx2("조성민");
    }
    //함수 정의
    static int fx1(int a,int b, int c, int d, int e){
        return a+b*c-d*e;
    }
    static  void fx2(String name){
        System.out.println("이름은 "+name+"입니다.");
    }
    static void fx3(){//함수명은 함수의 동작을 명확히 보여주어야한다.
        System.out.println(1+2*3/2*3);
        System.out.println(1+2*3/2*3);
        System.out.println(1+2*3/2*3);
        System.out.println(1+2*3/2*3);
        System.out.println(1+2*3/2*3);
        System.out.println(1+2*3/2*3);
    }

}
