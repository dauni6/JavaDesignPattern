package com.example.javadesignpattern.adapter.practice1;


/**
 * ProvideCoffee 클래스가 어댑터의 역할을 수행하고 준비되어 있는 Coffee 클래스를 extends 해서 provideCoffeePowder 메서드와
 * Provide 인터페이스를 implements 해서 provideCoffee 메서드를 구현.
 * 이렇게 함으로써 test 할 때는 참조변수 타입을 Provide 를 사용하기 때문에 개발자는 쉽게 원하는 메서드만 찾아서 사용 가능하며
 * 외부에서는 provideCoffeePowder()의 존재를 알 수가 없다.
 **/
public class ProvideCoffee extends Coffee implements Provide{

    public ProvideCoffee(String coffee) {
        super(coffee);
    }

    @Override
    public void provideCoffee() {
        provideCoffeePowder();
    }

}
