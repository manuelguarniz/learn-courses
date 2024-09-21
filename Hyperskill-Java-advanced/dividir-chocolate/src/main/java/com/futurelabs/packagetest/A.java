package com.futurelabs.packagetest;

import com.futurelabs.packagetest.package1.C;
import com.futurelabs.packagetest.package2.D;


class A1 {
    public void aaa() {}
}
class B1 extends A1 {

}
class C1 extends  B1 {

}

class Counter {

    protected int i = 1221;

    void printCount(){
        System.out.println(i);
    }

    void incCount(){
        i = i + 1;
    }

}

public class A {
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();

    public static void main(String[] args) {
        A1 a1 = new C1();
        A1 a2 = new B1();

        a1.aaa();

//        SubClass subClass = new SubClass();
//        subClass.display();

        Counter counter = new Counter();
        System.out.println(counter.i);
    }
}
