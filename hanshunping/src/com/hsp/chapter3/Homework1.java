package com.hsp.chapter3;

public class Homework1 {
    public static void main(String[] args) {
        short s = 12;
        //s = s - 9; // error 不能将 int 转为 short

        byte b = 10;
        //b = b + 11; // error 不能将 int 转为 short
        b = (byte) (b + 11); // correct

        char c = 'a';
        int i = 16;
        float d = .314F;
        double res = c + i + d; // correct

        byte e = 16;
        short f = 14;
        //short t = s + b; // error byte、short、char 在进行运算时会转为 int
    }
}
