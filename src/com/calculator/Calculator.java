package com.calculator;

public class Calculator {
    public int add(Integer ... numbers) {
        int result = 0;
        for (int num:numbers) {
            result = num + result;
        }
        return result;
    }


    public int subtraction(Integer ... numbers) {
        int result = 0;
        for (int num:numbers) {
            result = result - num;
        }
        return result;
    }

    public int division(Integer ... numbers) {
        int result = numbers[0];
        for (int num:numbers) {
            if (num != numbers[0]) {
                result = result / num;
            }
        }
        return result;
    }

    public int multiplication(Integer ... numbers) {
        int result = 1;
        for (int num:numbers) {
            System.out.println(num);
            result = num * result;
        }
        return result;
    }


}

