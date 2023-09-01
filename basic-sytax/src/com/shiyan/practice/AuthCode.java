package com.shiyan.practice;

import java.util.Random;

public class AuthCode {
    public static void main(String[] args) {
        System.out.println(generateAuthCode(5));
    }

//    开发一个程序, 生成指定长度的验证码, 验证码可以是数字和大小写字母
    public static String generateAuthCode(int number) {
        Random r = new Random();
        String resCode = "";
        for (int i = 0; i < number; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0 -> resCode += r.nextInt(10);
                case 1 -> resCode += (char) (r.nextInt(26) + 65);
                case 2 -> resCode += (char) (r.nextInt(26) + 97);
            }
        }

        return resCode;
    }
}
