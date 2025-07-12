package com.ogcz;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4,5};
        swap(arr1, 0, 1);
        System.out.println(Arrays.toString(arr1));


        int[] arr2 = {12, 15, 19, 21};
        System.out.println(max(arr2));
        

        int[]arr3 = {10, 20, 30, 40 ,50};
        reverse(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    static void reverse(int[] arr) {
    
        int start = 0;
        int end = arr.length - 1; // - 1 is to match the elements to index
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        
    }

    static int max(int[] arr) {

        if (arr == null) {
            return -1;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) { // this says if arr i is lesser than first index therefore minimum is sitll first array
                max = arr[i];
            }
        }

        return max;
    }

    static void swap(int[]array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
