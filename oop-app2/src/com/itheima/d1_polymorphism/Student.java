package com.itheima.d1_polymorphism;

public class Student extends People{
    String name = "学生";
    @Override
    public void run() {
        System.out.println("学生跑的飞快~~~");
    }

    public void study(){
        System.out.println("学生好好学习~~~");
    }
}
