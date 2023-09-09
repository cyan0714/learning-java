package com.itheima.d3_abstract;

public class Test {
    public static void main(String[] args) {
        // 目标：认识抽象类，掌握抽象类的基本作用。

        // 抽象类不能创建对象
        // A a = new A();

        B b = new B();
        b.setName("B");
        b.test();
    }
}

