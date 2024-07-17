package com.gmail.itisha65.homework161;

import java.util.Scanner;

public class MavenCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input variable 'a':");
        double a = scanner.nextDouble();

        System.out.println("Enter operator");
        char operator = scanner.next().charAt(0);

        System.out.println("Input variable 'b':");
        double b = scanner.nextDouble();

        if (operator == '+') {
            System.out.println("= " + calculator.addition(a, b));
        } else if (operator == '-') {
            System.out.println("= " + calculator.subtraction(a, b));
        } else if (operator == '*') {
            System.out.println("= " + calculator.multiplication(a, b));
        } else if (operator == '/' & b == 0) {
            System.out.println("Invalid operation!");
        } else if (operator == '/') {
            System.out.println("= " + calculator.dividing(a, b));
        } else {
            System.out.println("Invalid operation!");
        }
    }
}
