package com.jtspringproject.JtSpringProject;

import java.util.Scanner;

public class Paytm {

    public static void toBinary(int decimal){
        int binary[] = new int[40];
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();//new line
    }

    public static void main(String args[]){
        System.out.println("Decimal of 10 is: ");
        toBinary(10);
        System.out.println("Decimal of 21 is: ");
        toBinary(21);
        System.out.println("Decimal of 31 is: ");
        toBinary(31);

        System.out.println(Integer.parseInt("a",16));
        System.out.println(Integer.parseInt("f",16));
        System.out.println(Integer.parseInt("121",16));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: ");
//reading an integer from the user
        int n = sc.nextInt();
        int num=1, count=0, i;
        while (count < n)
        {
            num=num+1;
            for (i = 2; i <= num; i++)
            {
//determines the modulo and compare it with 0
                if (num % i == 0)
                {
//breaks the loop if the above condition returns true
                    break;
                }
            }
            if (i == num)
            {
//increments the count variable by 1 if the number is prime
                count = count+1;
            }
        }
//prints the nth prime number
        System.out.println("The " +n +"th prime number is: " + num);
    }

};

