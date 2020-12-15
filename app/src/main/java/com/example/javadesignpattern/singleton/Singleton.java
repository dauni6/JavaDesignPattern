package com.example.javadesignpattern.singleton;

/**
 * 애초에 싱글톤을 사용하는 이유는 사용하는 클래스가 반드시 1개만 존재해야함을 보증하고 싶을 때,
 * 인스턴스가 1개밖에 존재하지 않는다는 것을 프로그램 싱에서 표현하고 싶을 때 입니다.
 * */
public class Singleton {
    private static Singleton singleton;
    private Singleton() { // private 으로 막아서 혹여라도 프로그래머가 new 연산자를 사용을 막는 것을 '보장'한다
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() { // 유일한 인스턴스를 얻기 위한 static getInstance() 메서드
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

/**
 * 그럼 왜 싱글톤 패턴에서는 인스턴스의 수를 제한하고 있는걸까?
 * 제한을 한다는 것은 전제가 되는 조건을 늘린다는 의미이다.
 * 복수의 인스턴스가 존재하면 인스턴스들이 서로 영향을 미치고, 뜻하지 않은 버그가 발생할 가능성이 크다.
 * 그러나 인스턴스가 1개밖에 없다라는 보증이 있으면 그 전제조건 아래에서 프로그래밍 할 수 있다.
 *
 * */
