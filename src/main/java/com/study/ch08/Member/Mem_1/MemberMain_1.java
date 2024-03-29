package com.study.ch08.Member.Mem_1;

import java.util.Scanner;

public class MemberMain_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberRepository_1 memberRepository = new MemberRepository_1();
        MemberService_1 memberService = new MemberService_1();

        String selectedMenu = null;

        while (true) {
            System.out.println("[[회원 관리 프로그램]]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("q. 프로그램 종료하기");
            Member_1[] members = memberRepository.members;
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();
            if("1".equals(selectedMenu)) {
                //Member[] members = memberService.memders;
                int emptyCount = 0;
                if (emptyCount > 0) {}
                boolean isNull = false;

                for (int i = 0; i < members.length; i++) {
                    if(members[i] == null){
                        isNull = true;
                        break;
                    }
                }
                if(!isNull){
                    System.out.println("더 이상 회원 등록을 할 수 없습니다.");
                    continue;
                }
                boolean responseDate = memberService.addMember(memberRepository);
                if (responseDate) {
                    System.out.println("<<< 회원 등록 완료 >>>");
                } else {
                    System.out.println("<<< 회원 등록 취소 >>>");
                }

            } else if ("2".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<< 회원 전체 조회 >>>");
                for (int i = 0; i < members.length; i++) {
                    if(members[i] == null){
                        System.out.println("NULL");
                        continue;
                    }
                    System.out.println(members[i].toString());
                }
            } else if ("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else {
                System.out.println("다시 선택하세요.");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("<<<<<< 프로그램이 종료되었습니다. >>>>>>>");
    }

}
