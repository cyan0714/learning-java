package com.shiyan.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Judging {
    public static void main(String[] args) {
        System.out.println(calcScore(4));
    }

   //在唱歌比赛中, 可能有多名评委要给选手打分, 分数在[0, 100]之间的整数.选手最后得分为: 去掉最高和最低分后的剩余分数的平均分
   //请编写程序能够录入多名评委的分数, 并算出选手的最终得分.
    public static double calcScore(int n) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的分数");
            int score = sc.nextInt();
            scores[i] = score;
        }

        Arrays.sort(scores);

        double resScore = 0;
        for (int j = 0; j < scores.length; j++) {
            if (j == 0 || j == scores.length - 1) {
                resScore += 0;
            } else {
                resScore += scores[j];
            }
        }

        return resScore / (scores.length - 2);

    }
}
