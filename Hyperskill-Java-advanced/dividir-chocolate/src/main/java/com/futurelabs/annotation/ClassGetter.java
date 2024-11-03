package com.futurelabs.annotation;

import java.math.BigDecimal;

public class ClassGetter {

    public String getObjectClassName(Object object) {
        return object.getClass().getName();
    }
}

class Main3 {
    public static void main(String[] args) {
        ClassGetter classGetter = new ClassGetter();
        System.out.println(classGetter.getObjectClassName(new BigDecimal(0)));

    }
}