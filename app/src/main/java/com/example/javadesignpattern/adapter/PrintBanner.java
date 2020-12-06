package com.example.javadesignpattern.adapter;

/**
 * PrintBanner 클래스가 어댑터의 역할을 완수. 준비된 Banner 클래스를 확장(extends)해서 showWithParen 메소드와 showWIthAster 메서드를 상속
 * 필요한 Print 인터페이스를 구현(implements)해서 printWeak 메서드와 printStrong 메서드를 구현
 **/
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
