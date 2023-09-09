package com.itheima.d1_polymorphism;

public class Teacher extends People{
    String name = "老师";
    @Override
    public void run() {
        System.out.println("老师跑的比较慢~~~");
    }

    public void teach(){
        System.out.println("老师教授Java~~~");
    }
}
