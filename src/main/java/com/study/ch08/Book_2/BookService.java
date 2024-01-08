package com.study.ch08.Book_2;

import java.util.Scanner;
public class BookService {
    BookRepository bookRepository;


    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while (true){
            System.out.print(label + "명 >>> ");
            value = scanner.nextLine();//nextLine의 경우 null이 입력될 가능성이 없다.
            if(!value.isBlank()){
                break;
            }
        }
        return value;
    }

    boolean isFull(){
        return bookRepository.isEmpty() == -1;
    }

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    void BookInfo() {
        if(bookRepository.isEmpty() == 0){
            System.out.println("현재 등록된 정보가 없습니다.");
        } else {
            Book[] bookList = bookRepository.BookList();
            for (int i = 0; i < bookList.length; i++) {
                System.out.println(bookList[i].toString());
            }
        }




    }

    void addBook() {
        String title;
        title = inputValue("도서");
        String author;
        author = inputValue("작가");
        Book book = new Book(title, author);

        bookRepository.BookInsert(book);
    }


}
