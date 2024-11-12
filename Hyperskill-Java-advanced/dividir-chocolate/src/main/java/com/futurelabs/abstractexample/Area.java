package com.futurelabs.abstractexample;

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Area {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of circle: " + circle.getArea() + " perimeter: " + circle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Area of triangle: " + triangle.getArea() + " perimeter: " + triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.getArea() + " perimeter: " + rectangle.getPerimeter());
    }
}
