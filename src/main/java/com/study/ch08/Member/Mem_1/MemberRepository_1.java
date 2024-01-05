package com.study.ch08.Member.Mem_1;

import com.study.ch08.Member.Member;

public class MemberRepository_1 {

    Member_1[] members = new Member_1[3];

    int insert(Member_1 member) {
        for(int i = 0; i < members.length; i++){ // return 이후 배열이 사라져 저장이 안됨
            if(members[i] == null){
                members[i] = new Member_1(member.code, member.name, member.age, member.address);
                System.out.println("저장소에 Member 저장");
                System.out.println(members[i].toString());
                break;
            }
        }
        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i]);
        }

        return 1; // 1건 등록되었다.
    }


}
