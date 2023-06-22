package com.jtspringproject.JtSpringProject;

public class ProductList {
    String productList[] = {"Zara", "parda"};

    public static void main(String args[]) {
        int arr[] = {50, 60, 80, 90};

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);

        }

            for (int i = 1; i <= 10; i++) {
                String numberString = String.valueOf(i);
                System.out.println(numberString);
            }
            int[] age = {12, 4, 5};
            System.out.println("using for loop:");
            for (int i = 0; i < age.length; i++) {
                System.out.println(age[i]);
            }

            age = new int[5];
            age[0] = 12;
            age[1] = 4;
            age[2] = 5;
            System.out.println("numberString");



    }
}








