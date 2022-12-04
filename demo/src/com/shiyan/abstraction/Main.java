package com.shiyan.abstraction;

public class Main {
    public static void main(String[] args) {
        StudentChild sc = new StudentChild();
        StudentMiddle sm = new StudentMiddle();
        sc.write();
        sm.write();
    }
}
