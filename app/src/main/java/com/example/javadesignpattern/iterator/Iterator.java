package com.example.javadesignpattern.iterator;

/**
 * Iterator는 요소를 하나씩 나열하면서 루프 변수와 같은 역할을 수행하는 interface
 * @hasNext() : 다음 요소가 존재하는지 조사하기 위한 메서드
 * @next() : 다음 요소를 얻기 위한 메서드
 **/
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
