package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>();
    public static int indexCheck( String name) { //member 자체를 리턴하는 편이 효율이 좋다.
        int index = -1;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name)) {
                index = i;
            }
        }
        return index;
    }

    public static boolean NonMem(int index) { //메서드로 빼야했었나? continue; 문이라서 메서드에서 작동 불가, 불가피하게 한번 더 작성해야한다.
        boolean nonMem = (index == -1);
        if (nonMem){
            System.out.println("해당 이름의 회원은 존재하지 않습니다.");
            System.out.println();
        }
        return nonMem;
    }

    public static Member findMemberByName(String name) {
  //      Member findMember = null; //재사용 하는 경우 재사용할 때 마다 초기화 필요
        for (Member member : members) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("[ 회원 주소 %s하기 ]\n", label);
        System.out.printf("%s 할 회원의 이름을 입력하세요 >> ", label);
        return scanner.nextLine();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectedMenu = null;

        while(true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>");
            selectedMenu = scanner.nextLine();
            //1-5-4-6-2-3
            if ("1".equals(selectedMenu)) {
                /*
                * [ 회원 등록하기 ]
                * 이름 >> 조성민
                * 주소 >> 부산 진구
                * << 등록이 완료되었습니다. >>
                * */
                System.out.println("[ 회원 등록하기 ]");
                System.out.print("이름 >> ");
                String name = scanner.nextLine();
                System.out.print("주소 >> ");
                String address = scanner.nextLine();
                members.add(new Member(name, address));
                System.out.println("<< 등록이 완료되었습니다. >>");

            } else if ("2".equals(selectedMenu)) {
                /*
                * [ 회원 이름 수정하기 ]
                * 수정 할 회원의 이름을 입력하세요 >> 조성민
                * 해당이름이 없는 경우 : 해당 이름의 회원은 존재하지 않습니다.
                * 이름 >> 조성이
                * << 수정이 완료되었습니다. >>
                * */
                String name = inputSearchName("수정");
                Member findMember = findMemberByName(name);
                if(findMember == null){
                    System.out.println("해당 이름의 회원은 존재하지 않습니다.");
                    continue;
                }
                System.out.print("이름 >> ");
                String newName = scanner.nextLine();
                findMember.setName(newName);
                System.out.println("<< 수정이 완료되었습니다. >>");

            } else if ("3".equals(selectedMenu)) {
                /*
                 * [ 회원 주소 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요 >> 조성이
                 * 주소 >> 서울 용산구
                 * << 수정이 완료되었습니다. >>
                 * */
                String name = inputSearchName("수정");
                Member findMember = findMemberByName(name);
                if(findMember == null){
                    System.out.println("해당 이름의 회원은 존재하지 않습니다.");
                    continue;
                }
                System.out.print("주소 >> ");
                String newAddress = scanner.nextLine();
                findMember.setAddress(newAddress);
                System.out.println("<< 수정이 완료되었습니다. >>");

            } else if ("4".equals(selectedMenu)) {
                /*
                 * [ 회원 이름으로 조회하기 ]
                 * 조회 할 회원의 이름을 입력하세요 >> 조성이
                 * Member 객체 toString();
                 * << 조회가 완료되었습니다. >>
                 * */
                String name = inputSearchName("조회");
                //int index = indexCheck(name);
                Member findMember = findMemberByName(name);
                if(findMember == null){
                    System.out.println("해당 이름의 회원은 존재하지 않습니다.");
                    continue;
                }
                System.out.println(findMember);
                System.out.println("<< 조회가 완료되었습니다. >>");
            } else if ("5".equals(selectedMenu)) {
                /*
                 * [ 회원 조회하기 ]
                 * Member 전체 toString();
                 * << 조회가 완료되었습니다. >>
                 * */
                System.out.println("[ 회원 조회하기 ]");
                for (Member member : members) {
                    System.out.println(member);
                }
                System.out.println("<< 조회가 완료되었습니다. >>");

            } else if ("6".equals(selectedMenu)) {
                /*
                 * [ 회원 이름으로 삭제하기 ]
                 * 삭제 할 회원의 이름을 입력하세요 >> 조성이
                 * 삭제된 Member 객체 toString(); // remove 시 삭제한 객체 리턴
                 * << 삭제가 완료되었습니다. >>
                 * */
                String name = inputSearchName("삭제");
                Member findMember = findMemberByName(name);
                if (findMember == null) {
                    System.out.println("해당 이름의 회원은 존재하지 않습니다.");
                    continue;
                }
                members.remove(findMember);
                System.out.println(findMember);
//                int index = indexCheck(name);
//                if(NonMem(index)){
//                    continue;
//                }
//                Member member = members.remove(index);
//                System.out.println(member);
                System.out.println("<< 삭제가 완료되었습니다. >>");

            } else if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료.");


    }

}
