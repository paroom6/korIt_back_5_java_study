package com.study.ch08.Book_1;

import com.study.ch08.car.Car;

public class BookRepository {
    final Book[] books;

    public BookRepository(Book[] books) {
        this.books = books;
    }

    int getEmptyIndex() {
        int bookCount = 0;
        for (int i = 0; i < books.length; i--) {
            if (books[i] == null) {
                bookCount = i;
                return bookCount;
            }
        }
        return -1;
    }

    void insert(Book book) {
        books[getEmptyIndex()] = book;
        System.out.println("도서등록 완료");
    }


    Book[] getBookDatas() {
        int bookCount = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                bookCount++;
            }
        }
        Book[] bookList = new Book[bookCount];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                bookList[j] = books[i];
                j++;
            }
        }
        return bookList;
    }



}
