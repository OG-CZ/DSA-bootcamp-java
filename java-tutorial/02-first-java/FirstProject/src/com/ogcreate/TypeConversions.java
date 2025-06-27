package com.ogcreate;

public class TypeConversions {
    public static void main(String[] args) {
        
        // widening
        int a = 10;
        float b = a;
        System.out.println(b);

        // narrow or type casting
        int c = (int) 34.33f;
        System.out.println(c);

        // narrow or type casting
        long d = (long) 123.123;
        System.out.println(d);

        /* 
        outputs:
            10.0
            34
            123
         */
    }
}
