package com.shiyan.type;

public class TypeDemo {
    public static void main(String[] args) {
//      char can be assign to int, but not vise versa
        char a = 'a';
        int b = a;
        double c = 922.2;
        System.out.println(c >= 2 & c >=199);

        System.out.println(b); // 97
    }
}
