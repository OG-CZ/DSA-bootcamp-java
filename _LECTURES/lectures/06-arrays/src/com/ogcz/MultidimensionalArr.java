package com.ogcz;

import java.util.Arrays;

public class MultidimensionalArr {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = row + col;
            }
        }

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
    
}
