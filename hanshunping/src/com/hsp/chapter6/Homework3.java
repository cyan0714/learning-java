package com.hsp.chapter6;

public class Homework3 {
    public static void main(String[] args) {
        String foo = "blue";
//        默认值为 false
        boolean[] bar = new boolean[2];
        if (bar[0]) {
            foo = "green";
        }
        System.out.println(foo); // blue
    }
}
