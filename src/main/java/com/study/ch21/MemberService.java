package com.study.ch21;


import java.util.ArrayList;

public interface MemberService {
    public void  printMemberList(ArrayList<Member> members) throws Exception; //예외처리를 해야만 하는 메소드, 대부분의 메소드에 넣는다.
}
