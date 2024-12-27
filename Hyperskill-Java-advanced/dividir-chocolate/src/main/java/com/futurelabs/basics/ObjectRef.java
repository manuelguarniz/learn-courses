package com.futurelabs.basics;

public class ObjectRef {
    public static void main(String[] args) {
        int a = 100;
        int b = a;

        String c = new String("abc");
        String d = c;

        System.out.println(b);
        b = 10;
        System.out.println(a);

        System.out.println(c);
        System.out.println(d);
        d = "AAA";
        System.out.println(c);
    }
}
