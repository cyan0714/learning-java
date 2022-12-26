package com.hsp.chapter6;

public class Homework1 {
    // 创建一个char类型的26个元素的数组，分别放置'A'-'Z'。使用for循环访问所有元素并打印出来。
    public static void main(String[] args) {
        char[] chars = new char[26];

        for (int i = 0; i < 26; i++) {
            chars[i] = (char)('A' + i);
            System.out.print(chars[i] + " ");
        }
    }
}
