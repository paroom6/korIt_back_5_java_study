package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {
        /*
        * 조건연산자(삼항 연산자)
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
        *  true인 경우 바로 뒤 값을 리턴 그렇지 않으면 : 뒤의 값을 리턴
        *   ? 참의 값 : 거짓의 값
        * */


        int iResult = 10 > 2 ? 1111 : 2222; //결과값과 자료형이 일치해야 한다. 식이 아닌 값만 리턴된다.
        String SResult = 10 > 2 ? "1111"+1 : "2222"; //결과값과 자료형이 일치해야 한다. 식이 아닌 값만 리턴된다.
        boolean bResult = 10 > 2 ? true : false; // 식이 잘못된 것은 아니지만 boolean bResult = 10 > 2;와 같다.
        //숫자의 공백 0 문자열의 공백 "" 변수의 공백 null(변수가 선언되어 메모리는 할당되었지만 지정된 주소가 없다.)
        String name = null;
        System.out.println(name==null);//null체크 가능,
        //boolean nn = null;
        Boolean n = null;//Boolean은 null을 받을 수 있다.
        System.out.println("테스트 코드 작성");



    }
}
