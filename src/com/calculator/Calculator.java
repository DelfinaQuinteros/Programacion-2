package com.calculator;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int division(int num1, int num2) {
        int result = 0;
        if (num2 > 0) {
            result = num1 / num2;
        } else {
            System.out.println("Cannot be divided by 0");
        }
        return result;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }
}

