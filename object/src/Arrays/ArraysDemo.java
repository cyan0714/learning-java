package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] arr = {10, 2, 33, 8, 29};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return  o2 - o1;
//            }
//        });
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr, 33);
        System.out.println(index);
        System.out.println(Arrays.binarySearch(arr, 333));
    }
}
