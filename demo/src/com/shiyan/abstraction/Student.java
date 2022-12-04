package com.shiyan.abstraction;

abstract public class Student {
    public void write() {
        System.out.println("开头");
        System.out.println(this.writeMain());
        System.out.println("结尾");
    }

    public abstract String writeMain();
}
