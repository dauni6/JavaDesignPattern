package com.example.javadesignpattern.iterator;

/**
 * 서가를 나타내는 클래스.
 * 이 클래스를 '집합체'로 다루기 위해 Aggregate 인터페이스를 구현
 **/
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
