package com.futurelabs.annotation;

class A {

    public void method() {
        System.out.println("A");
    }
}

class B extends A {

    public void method() {
        System.out.println("B");
    }
}

class C extends B {

}

class D extends C {

    public void method() {
        super.method();
    }
}

public class Overiding {
    public static void main(String[] args) {
        A a = new D();
        a.method();

    }
}
