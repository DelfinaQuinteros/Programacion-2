package com.calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final String MENU_MESSAGE = "\n1-Input the numbers:\n2-Enter the operation( / * - + ):";

    public static void show() {
        System.out.println(MENU_MESSAGE);
    }

    public static void readOption(){
        Scanner reader = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        int num = 0;
        while (num != 1) {
            System.out.println("Insert the number:");
            num = reader.nextInt();
            System.out.println("Insert '0' to stop");
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }
        System.out.println("Insert the operation:");
        String operation = reader.next();
        processOption(operation, numbers);
    }

    private static void processOption(String operation, List<Integer> numbers){
        Calculator calc = new Calculator();
        int result = switch (operation) {
            case "+" -> calc.add(numbers.toArray(new Integer [0]));
            case "-" -> calc.subtraction(numbers.toArray(new Integer [0]));
            case "*" -> calc.multiplication(numbers.toArray(new Integer [0]));
            case "/" -> calc.division(numbers.toArray(new Integer [0]));
            default -> 0;
        };
        Logger.log("The result is: " + result);
    }
}
