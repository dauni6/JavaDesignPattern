package com.example.javadesignpattern.strategy;

public class Hand {
    public static final int HAND_VALUE_ROCK = 0; // 주먹
    public static final int HAND_VALUE_SCISSORS = 1; // 가위
    public static final int HAND_VALUE_PAPER = 2; // 보
    
    public static final int FIGHT_WIN = 1; // 승리
    public static final int FIGHT_LOSE = -1; // 패배

    public static final Hand[] hand = {
            new Hand(HAND_VALUE_ROCK),
            new Hand(HAND_VALUE_SCISSORS),
            new Hand(HAND_VALUE_PAPER)
    };

    private static final String[] name = { // 가위바위보의 손의 문자열 표현
            "주먹", "가위", "보"
    };

    private int handvalue; // 가위바위보 손의 값

    public Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) { // 값에서 인스턴스를 얻는다
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == FIGHT_WIN; // this가 h를 이길 경우 true
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == FIGHT_LOSE; // this가 h에게 질 경우 true
    }

    private int fight(Hand h) { // 무승부 0, this의 승이면 1, h의 승이면 -1
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return FIGHT_WIN;
        } else {
            return FIGHT_LOSE;
        }
    }

    public String toString() {
        return name[handvalue];
    }


}
