package com.example.javadesignpattern.prototype;

public interface Ramen extends Cloneable{
    public abstract void use(String s);

    public abstract Ramen createClone();
}
