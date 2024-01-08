package com.study.ch08.Book_2;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);


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

                if(bookService.isFull()) {
                    System.out.println("현재 등록이 불가합니다.");
                    continue;
                }

                bookService.addBook();

            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 현재 등록된 도서 >>>");
                bookService.BookInfo();

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
