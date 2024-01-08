package com.study.ch08.Book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];
        String selectedMenu = null;
        boolean loopFlag = true;
        while (loopFlag) {
            System.out.println();
            System.out.println("<<< 도서 관리 프로그램 >>>");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 리스트");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택 >> ");
            selectedMenu = scanner.nextLine();
            System.out.println();

            if("1".equals(selectedMenu)) {
                System.out.println("<< 도서 등록 >>");
                boolean isFull = false;
                for (int i = 0; i < books.length; i++) {
                    if(books[i] == null){
                        break;
                    }
                    isFull = true;
                }
                if(isFull) {
                    System.out.println("현재 등록이 불가합니다.");
                    continue;
                }
                System.out.print("도서명 >> ");
                String title = scanner.nextLine();
                System.out.print("작가명 >> ");
                String author = scanner.nextLine();

                Book book = new Book(title, author);
                for (int i = 0; i < books.length; i++) {
                    if(books[i] == null){
                        books[i] = book;
                        break;
                    }
                }
            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 현재 등록된 도서 >>>");
                for (int i = 0; i < books.length; i++) {
                    if(books[i] == null){
                        System.out.println("현재 등록된 정보가 없습니다.");
                    } else {
                        System.out.println(books[i].toString());
                    }
                }

            } else if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료중...");
                System.out.println();
                loopFlag = false;

            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

        }


        System.out.println("프로그램이 종료되었습니다.");
    }
}
