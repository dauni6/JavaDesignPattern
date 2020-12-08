package com.example.javadesignpattern.factory.framework;

/**
 * 제품을 표현한 클래스
 * 단, 구체적인 구현은 모두 하위 클래스에 맡김
 * 인스턴스 생성을 위한 골격(framework)의 역할을 함
 **/
public abstract class Product {
    public abstract void use();
}
