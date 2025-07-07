package com.ogcreate;

public class PasssingValue {
    public static void main(String[] args) {
        String name = "kunal";
        changeName(name);
        System.out.println(name);

        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void changeName(String any) {
        any = "Rahul rana";
    }
}
