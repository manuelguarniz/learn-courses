package com.futurelabs;

class A {}

class B extends A { }

class C extends B { }

class D extends B { }

class E extends D { }

class F {
    private String a;
    private String b;
    public F(String a) {
        this.a = a;
    }
    public F(String a, String b) {

        // aaaaa
        this(a);
        this.b = b;
    }
}

public class Letters {
    public static void main(String[] args) {

//        A var = new D();
//        B var1 = new D();
//        C var2 = new D();
//        D var3 = new D();
//        E var3 = new D();

        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter);
            letter++;
        }
    }
}
