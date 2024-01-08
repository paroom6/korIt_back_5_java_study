package com.study.ch08.Book_1;

public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    boolean isFull() {
        return bookRepository.getEmptyIndex() == -1;
    }

    void append(String title,String author) {
        Book book = new Book(title, author);
        bookRepository.insert(book);
    }
    void bookInfo() {
        Book[] bookList = bookRepository.getBookDatas();
        if(bookList.length == 0) {
            System.out.println("현재 등록된 정보가 없습니다.");
            return;
        }
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i].toString());
        }
    }
}
