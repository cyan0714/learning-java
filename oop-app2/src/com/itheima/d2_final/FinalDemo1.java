package com.itheima.d2_final;

public class FinalDemo1 {
    public static void main(String[] args) {
        // 目标：掌握final关键字的基本作用。

        // 变量有几种？ 局部变量  成员变量（类变量，实例变量）
        final double a = 3.14;
        // a = 3.15; // 第二次赋值

        pay(0.8);

        E e = new E();
        // e.name = "李四";
        // E.schoolName = "程序员"; // 第二次赋值

        // 注意事项：
        final int a2 = 10;
        // a2 = 23;

        final int[] arr1 = {10, 20, 30};
        // arr1 = null; // 第二次赋值
        arr1[1] = 222;
        System.out.println(arr1[1]);
    }

    public static void pay(final double z){
        // z = 0.9; // 第二次赋值
    }
}

class E{
    final String name = "张三";
    final static String schoolName = "黑马"; // 常量
}

// final的作用：修饰类，类不能被继承了
//final class A{}
//class B extends A{}

class C{
    // final修饰方法，方法不能被重写了
    public final void test(){

    }
}

class D extends C{
//    @Override
//    public void test() {
//
//    }
}




