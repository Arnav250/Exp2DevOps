package com.arnav;

public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int multiply(int a, int b) { return a * b; }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("2 + 3 = " + c.add(2, 3));
        System.out.println("4 * 5 = " + c.multiply(4, 5));
    }
}
