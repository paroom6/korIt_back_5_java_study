package com.study.ch08.Member;

public class MemberRepository {

    Member[] members = new Member[3];

    int insert(Member member) {
        for(int i = 0; i < members.length; i++){ // return 이후 배열이 사라져 저장이 안됨
            if(members[i] == null){
                members[i] = new Member(member.code, member.name, member.age, member.address);
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
