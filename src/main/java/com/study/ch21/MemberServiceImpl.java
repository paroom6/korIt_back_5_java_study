package com.study.ch21;

import java.util.ArrayList;

public class MemberServiceImpl implements MemberService{

    @Override
    public void printMemberList(ArrayList<Member> members) throws Exception {
        for (int i = 0; i < members.size() + 1; i++) {
            System.out.println(members.get(i));
        }
    }
}
