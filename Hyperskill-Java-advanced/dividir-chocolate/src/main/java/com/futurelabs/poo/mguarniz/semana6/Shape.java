package com.futurelabs.poo.mguarniz.semana6;

interface ShapeAreaInterface {
    double calculateArea();
}

class Shape {
    private String color;
    private String name;
    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("The shape is %s and color is %s", name, color);
    }
}

class Circle extends Shape implements ShapeAreaInterface {
    private double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape implements ShapeAreaInterface {
    private double base;
    private double height;

    public Triangle(String color, String name, double base, double height) {
        super(color, name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}

class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("red", "🔺", 2.0, 3.0);
        double triangleArea = triangle.calculateArea();

        Circle circle = new Circle("yellow", "🟡", 4.5);
        double circleArea = circle.calculateArea();

        System.out.printf("%s tiene %.2f mts2 de area\n", triangle, triangleArea); // The shape is 🔺 and color is red tiene 3.00 mts2 de area
        System.out.printf("%s tiene %.2f mts2 de area\n", circle, circleArea); // The shape is 🟡 and color is yellow tiene 63.62 mts2 de area
    }
}