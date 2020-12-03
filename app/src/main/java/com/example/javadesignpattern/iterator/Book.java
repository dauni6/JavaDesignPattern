package com.example.javadesignpattern.iterator;

/**
 * 책을 나타내는 클래스.
 * 할 수 있는 역할은 책 이름을 getName 메서드에서 얻는 것.
 * 책 이름은 Constructor에서 인스턴스를 초기화할 때 인수로 지정
 **/
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
