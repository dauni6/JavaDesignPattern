package com.example.javadesignpattern.iterator;
/**
 * BookShelfIterator를 Iterator로서 다루기 위해 Iterator 인터페이스를 구현.
 * @bookShelf : BookShelfIterator가 검색하 서가
 * @index : 현재 주목하고 있는 책을 가리킴
 **/
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }

    @Override
    public Object nextArrayList() {
        Book book = bookShelf.getBookAtFromArrayList(index);
        index++;
        return book;
    }

}
