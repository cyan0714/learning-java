package com.shiyan.random;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = {22, 12, 23, 34};
        List list = new ArrayList();
        for (int num : nums) {
            list.add(num);
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}
