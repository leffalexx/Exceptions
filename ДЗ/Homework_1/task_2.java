package Homework_1;

import java.util.Arrays;

public class task_2 {
    public static int[] dividingArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Arrays sizes must be equal!");
        }
        int[] dividedArrays = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            dividedArrays[i] = arr2[i] - arr1[i];
        }
        return dividedArrays;
    }
    public static void main(String[] args) {
        int [] x = {55, 78, 54, 333};
        int [] y = {7, 14};
        System.out.println(Arrays.toString(dividingArrays(x, y)));
    }
}
