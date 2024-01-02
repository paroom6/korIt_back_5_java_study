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
}
