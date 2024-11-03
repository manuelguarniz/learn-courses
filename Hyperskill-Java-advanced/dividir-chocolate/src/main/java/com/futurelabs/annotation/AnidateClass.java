package com.futurelabs.annotation;

public class AnidateClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = double[][][][].class;
        String s = "[[[[D";
        Class forName = Class.forName(s);
        System.out.println(clazz.equals(forName));
    }
}

class Main4 {
    public static void main(String[] args) {
        Class voidClass = void.class;
        System.out.println(int.class.getClass().getClass());
    }
}