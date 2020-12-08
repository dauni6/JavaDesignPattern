package com.example.javadesignpattern.factory.framework;

/**
 *
 **/
public abstract class Factory {
    // 메서드 오버라이딩을 막기위해 final로 설정. 따라서 사용만 가능
    // (왜냐하면 현재 템플릿 메서드를 사용중이고 템플릿 메서드는 오버라이딩을 기본적으로 허용하지 않음)
    public final Product create(String owner) {
        Product p = createProduct(owner); // 제품 만들기
        registerProduct(p); // 제품 등록
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

}
