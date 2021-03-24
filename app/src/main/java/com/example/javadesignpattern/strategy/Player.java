package com.example.javadesignpattern.strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) { // 이름과 전략을 할당받는다
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() { // 전략의 지시를 받는다
        return strategy.nextHand();
    }

    public void win() { // 승
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() { // 패
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() { // 무승부
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
