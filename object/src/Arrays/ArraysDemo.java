package Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {10, 2, 33, 8, 29};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 33);
        System.out.println(index);
        System.out.println(Arrays.binarySearch(arr, 333));
    }
}
