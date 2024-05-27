package org.example;

public class Main {
    public static void main(String[] args) {
        String action = args[1];
        Integer firstNumber = Integer.parseInt(args[0]);
        Integer secondNumber = Integer.parseInt(args[2]);

        switch (action) {
            case "+":
                System.out.println("Answer: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Answer: " + (firstNumber - secondNumber));
                break;
            case "x":
                System.out.println("Answer: " + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("Answer: " + (firstNumber / secondNumber));
                break;
        }
    }
}