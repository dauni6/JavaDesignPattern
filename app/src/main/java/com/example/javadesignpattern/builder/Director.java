package com.example.javadesignpattern.builder;

// Builder 클래스로 선언되어 있는 메서드를 사용해서 문서를 만들자.
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() { // 문서 구축하기(복잡한 메서드를 좋바해서 인스턴스를 구축하는 단순한 인터페이스를 외부에 제공하는 메서드)
        builder.makeTitle("Greeting");
        builder.makeString("아침과 낮에");
        builder.makeItems(new String[]{
                "좋은 아침입니다.",
                "안녕하세요."
        });
        builder.makeString("밤에");
        builder.makeItems(new String[]{
                "안녕하세요.",
                "안녕히 주무세요",
                "안녕히 계세요"
        });
        builder.close();
    }

}
