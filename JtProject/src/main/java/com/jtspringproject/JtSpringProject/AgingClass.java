package com.jtspringproject.JtSpringProject;

import java.util.Scanner;

public class AgingClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the operators: +, -, *, /   ");
        int num3 = scanner.nextInt();
        if (num3 == 1){
            int sum = num1 + num2;
            System.out.println("The sum of the two numbers is: " + sum);
        } else if (num3 == 2) {
            int sum = num1 - num2;
            System.out.println("The sum of the two numbers is: " + sum);
        } else if (num3 == 3) {
            int sum = num1 * num2;
            System.out.println("The sum of the two numbers is: " + sum);
        }else{
            int sum = num1 / num2;
            System.out.println("The sum of the two numbers is: " + sum);
        }
        scanner.close();
    }
}





