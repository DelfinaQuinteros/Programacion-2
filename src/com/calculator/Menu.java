package com.calculator;
import java.util.Scanner;

public class Menu {
    private static final String MENU_MESSAGE = "\n1-Input two numbers:\n2-Enter the operation( / * - + ):";

    public static void show() {
        System.out.println(MENU_MESSAGE);
    }

    public static void readOption(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert the first number:");
        int firstNumber = reader.nextInt();
        System.out.println("Insert the second number:");
        int secondNumber = reader.nextInt();
        System.out.println("Insert the operation:");
        String operation = reader.next();
        processOption(operation, firstNumber, secondNumber);
    }

    private static void processOption(String operation, int firstNumber, int secondNumber){
        Calculator calc = new Calculator();
        int result = switch (operation) {
            case "+" -> calc.add(firstNumber, secondNumber);
            case "-" -> calc.subtraction(firstNumber, secondNumber);
            case "*" -> calc.multiplication(firstNumber, secondNumber);
            case "/" -> calc.division(firstNumber, secondNumber);
            default -> 0;
        };
        Logger.log("The result is: " + result);
    }
}
