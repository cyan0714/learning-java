package com.shiyan.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("您的年龄是：" + age);

        System.out.println("请输入名称");
        String name = sc.next();
        System.out.println("您的名称是：" + name);
    }
}
