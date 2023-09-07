package com.itheima.demo;

public class Test7 {
    public static void main(String[] args) {
        // 目标：完成找素数。
        // 1、定义一个for循环，产生101-200之间的每个数据
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            // i = 101 102 103 ... 199 200
            // i = 102

            // 2、假设这个数据是素数。
            boolean flag = true;

            // 3、校验假设是否成功
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    flag = false; // 假设失败，当前i对应扥数据不是素数了
                    break;
                }
            }

            // 4、判断flag如果依然是true，真的是素数，我们应该输出
            if(flag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("个数是：" + count);
    }
}
