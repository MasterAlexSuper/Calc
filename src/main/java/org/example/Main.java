package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose operation:");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        Scanner sc = new Scanner(System.in);
        String action = sc.next();
        Integer firstNumber = Integer.parseInt(args[0]);
        Integer secondNumber = Integer.parseInt(args[1]);

        switch (action) {
            case "1":
                System.out.println("Answer: " + (firstNumber + secondNumber));
                break;
            case "2":
                System.out.println("Answer: " + (firstNumber - secondNumber));
                break;
            case "3":
                System.out.println("Answer: " + (firstNumber * secondNumber));
                break;
            case "4":
                System.out.println("Answer: " + (firstNumber / secondNumber));
                break;
        }
    }
}