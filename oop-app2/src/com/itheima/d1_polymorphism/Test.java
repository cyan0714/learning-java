package com.itheima.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 目标：认识多态
        People p1 = new Teacher();
        System.out.println(p1.name);
        p1.run();

        People p2 = new Student();
        System.out.println(p2.name);
        p2.run();
    }
}
