package com.shiyan.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int data = rd.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入一个数（0-100）：");
            int guessNumber = sc.nextInt();

            if (data > guessNumber) {
                System.out.println("您猜的数小了");
            } else if (data < guessNumber) {
                System.out.println("您猜的数大了");
            } else {
                System.out.println("恭喜你！猜对了，去买单吧~");
                break;
            }
        }
    }
}
