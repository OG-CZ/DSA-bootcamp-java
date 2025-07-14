package com.ogcz;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // array of primitives
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        String str = Arrays.toString(arr);
        System.out.println(str);
        // [0,1,2,3,4,5]
    
        // array of objects
        
    }


}
