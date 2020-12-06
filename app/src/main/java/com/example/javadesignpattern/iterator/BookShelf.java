package com.example.javadesignpattern.iterator;

import java.util.ArrayList;

/**
 * 서가를 나타내는 클래스.
 * 이 클래스를 '집합체'로 다루기 위해 Aggregate 인터페이스를 구현
 **/
public class BookShelf implements Aggregate {
    private Book[] books;
    private ArrayList<Book> bookArray;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public BookShelf(ArrayList<Book> bookArray) {
        this.bookArray = bookArray;
    }

    public Book getBookAtFromArrayList(int index) {
        return bookArray.get(index);
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void addBook(Book book) {
        this.bookArray.add(book);
        last++;
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public int getLengthArray() {
        return bookArray.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
