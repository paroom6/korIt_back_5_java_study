package com.study.ch21;

import java.util.ArrayList;

public class MemberMain {
    public static void main(String[] args)  {//throws Exception //호출한 장소에서 예외처리를 해준다. 이 경우 JVM에서 예외처리를 한다.

            ArrayList<Member> members = new ArrayList<>();
            members.add(Member.builder().name("조성민").build());
            members.add(Member.builder().name("조성이").build());
            members.add(Member.builder().name("민성조").build());
            members.add(Member.builder().name("조성삼").build());
            MemberService memberService = new MemberServiceImpl();
            try {
                memberService.printMemberList(members); //해당 메서드를 사용시 무조건 예외처리하도록 함

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("프로그램 종료");


    }

}
