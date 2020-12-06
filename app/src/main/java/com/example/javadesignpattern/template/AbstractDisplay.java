package com.example.javadesignpattern.template;

public abstract class AbstractDisplay {
    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public final void display() { // display만 구현하는 중
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
