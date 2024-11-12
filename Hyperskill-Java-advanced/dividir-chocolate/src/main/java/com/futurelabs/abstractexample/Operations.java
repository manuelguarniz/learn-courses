package com.futurelabs.abstractexample;

abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

class Addition extends IntBinaryOperation {
    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }
    @Override
    public int perform() {
        return firstArg + secondArg;
    }
}

class Multiplication extends IntBinaryOperation {
    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }
    @Override
    public int perform() {
        return firstArg * secondArg;
    }
}

public class Operations {
    public static void main(String[] args) {
        Addition addition = new Addition(3, 2);
        System.out.println("3 + 2 = " + addition.perform());

        Multiplication multiplication = new Multiplication(7, 2);
        System.out.println("7 * 2 = " + multiplication.perform());
    }
}
