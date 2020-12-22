package com.example.javadesignpattern.prototype;

public class UnderlinePen implements Product {
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try{
            p = (Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
