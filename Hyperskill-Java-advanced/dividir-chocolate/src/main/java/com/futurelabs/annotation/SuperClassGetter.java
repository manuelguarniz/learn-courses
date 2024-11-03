package com.futurelabs.annotation;

import java.util.ArrayList;

public class SuperClassGetter {
    public Class getSuperClassByName(String name) throws ClassNotFoundException {
        return Class.forName(name).getSuperclass();
    }

    public Class getSuperClassByInstance(Object object) {
        return object.getClass().getSuperclass();
    }
}

class Main2 {
    public static void main(String[] args) {
        SuperClassGetter superClassGetter = new SuperClassGetter();
        Class clazz1 = superClassGetter.getSuperClassByInstance(new ArrayList<>());
        System.out.println(clazz1);
        Class clazz2 = superClassGetter.getSuperClassByInstance("java.lang.List");
        System.out.println(clazz2);
    }
}
