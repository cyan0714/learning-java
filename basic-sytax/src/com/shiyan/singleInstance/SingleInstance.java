package com.shiyan.singleInstance;

public class SingleInstance {
    public static SingleInstance instance = new SingleInstance();
    private SingleInstance () {
        System.out.println("created a obj");
    }

    public static void main(String[] args) {
    }
}

class Test {
    static {
        System.out.println(SingleInstance.instance);
    }
}
