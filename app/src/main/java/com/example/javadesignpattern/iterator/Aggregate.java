package com.example.javadesignpattern.iterator;

/**
 * Aggregate : 합계, 총액, *집합을 의미
 * 집합체에 대응하는 Iterator 1개를 작성하기 위한 interface
 **/
public interface Aggregate {
    public abstract Iterator iterator();
}
