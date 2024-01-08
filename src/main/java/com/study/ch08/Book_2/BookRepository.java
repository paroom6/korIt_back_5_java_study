package com.study.ch08.Book_2;

public class BookRepository {
    final Book[] books;

    public BookRepository(Book[] books) {
        this.books = books;
    }
    int BookCount = 0;
    int isEmpty() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                BookCount = i;
                return BookCount;
            }
        }
        return -1;
    }

    void BookInsert(Book book) {
        books[isEmpty()] = book;

        System.out.println("---- 도서등록 완료 ----");

    }

    Book[] BookList() {
        int bookCount = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                bookCount ++;
            }
        }
        Book[] booksList = new Book[bookCount];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                booksList[j] = books[i];
                j++;
            }
        }
        return booksList;
    }


}
