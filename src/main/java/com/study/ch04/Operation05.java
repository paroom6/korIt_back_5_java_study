package com.study.ch04;

public class Operation05 {
    public static void main(String[] args) {
        /*
        * int x = 1;
        * int y = 1;
        *
        * x와 y 중 하나라도 값이 0이면 결과는 "오류"
        * x,y 값에 맞는 사분면을 출력
        *
        *  */
        int x = 0;
        int y = 1;
        String result1 = x == 0 || y == 0 ? "오류"
                        : (x > 0 ? (y > 0 ? "1 사분면" :"4 사분면")
                        : (y > 0 ? "2 사분면" : "3 사분면"));
        String result2 = x == 0 || y == 0 ? "오류"
                         : x > 0 && y > 0 ? "1 사분면"
                         : x < 0 && y > 0 ? "2 사분면"
                         : x < 0 && y < 0 ? "3 사분면" : "4 사분면";
        System.out.println(result1);
        System.out.println(result2);
        String z = String.valueOf(x);
        System.out.println(z);
        /*
        * git
        * Local - 현재 작업하는 pc환경 -git
        *
        * working directory - 현재 상태
        * 1. 파일 버전 관리
        * x.x.x
        * 주 크게 리뉴얼 될 때
        * 부 리뉴얼 없이 기능들이 업데이트 될 때
        * 수 오류수정등 기능의 추가 없이 업데이트 될 때
        * .git
        * .git igore
        * -------------------------------
        * git add - 선택  git reset - 초기화
        * -------------------------------
        * staging area
        * 중간 임시저장 구역
        * commit 후 삭제
        * -------------------------------
        * git commit - 저장
        * -------------------------------
        * repository
        * commit 메세지
        * commit ID - 중복불가능한 식별변호
        * history - commit 내역이 남음 현재 작업중인 시점(head)
        *
        * Remote - github
        * 2. 협업
        * .git - 숨겨진 폴더
        * user.name
        * user.email - 누가 작업했는지 확인
        *
        * */



    }

    public static class Operation06 {
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




        }
    }
}
