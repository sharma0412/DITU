package com.jtspringproject.JtSpringProject.services;

public class UserProfile {

    public static void main(String args[]) {
        try{
            for (int i = 1; i <= 10; i++) {
                String numberString = String.valueOf(i);
                System.out.println(numberString);
            }
            int[] age = {12, 4, 5};
            System.out.println("using for loop:");
            for (int i = 0; i < age.length; i++) {
                System.out.println(age[i]);
            }

            System.out.println("numberString");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }


}
