package com.shiyan.array;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {23, 24, 25};
        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        for (int item : arr) {
            sum += item;
        }
        System.out.println(sum);
    }
}
