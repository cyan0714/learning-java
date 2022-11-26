package com.shiyan.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        // byte、short、char will transform to int when in operation
        byte a = 100;
        byte b = 120;
        int c = a + b;
        System.out.println(c);
    }
}
