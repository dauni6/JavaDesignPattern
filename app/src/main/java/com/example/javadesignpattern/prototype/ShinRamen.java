package com.example.javadesignpattern.prototype;

public class ShinRamen implements Ramen{

    private char decoChar;

    public void setDecoChar(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar + " " + s + " " + decoChar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public Ramen createClone() {
        Ramen r = null;
        try {
            r = (Ramen)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return r;
    }

}
