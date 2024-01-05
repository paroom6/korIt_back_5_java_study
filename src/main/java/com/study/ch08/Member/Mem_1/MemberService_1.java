package com.study.ch08.Member.Mem_1;

import com.study.ch08.Member.Member;

import java.util.Scanner;

public class MemberService_1 {

    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while (true){
            System.out.print(label + "(입력취소: exit) >>> ");
            value = scanner.nextLine();//nextLine의 경우 null이 입력될 가능성이 없다.
            if(!value.isBlank()){
                break;
            }
        }
        return value;
    }


    boolean addMember(MemberRepository_1 memberRepository) {

        String code = null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<< 회원 등록 >>>");
        System.out.println();
        code = inputValue("회원코드");
        if("exit".equalsIgnoreCase(code)) {
            return false;
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)) {
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)) {
            return false;
        }
        Member_1 member = new Member_1(code, name, Integer.parseInt(age), address);
        return memberRepository.insert(member) > 0;
    }

}
