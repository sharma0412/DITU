package com.jtspringproject.JtSpringProject;

import java.io.*;
import java.util.*;



class UserMainCode

{

    public static String userIdGeneration(String input1, String input2, String input3, int input4)
    {
        String smallerName, longerName;
        if (input1.length() < input2.length()) {
            smallerName = input1;
            longerName = input2;
        } else if (input1.length() > input2.length()) {
            smallerName = input2;
            longerName = input1;
        } else {
            if (input1.compareTo(input2) <= 0) {
                smallerName = input1;
                longerName = input2;
            } else {
                smallerName = input2;
                longerName = input1;
            }
        }


        String userId = smallerName.charAt(0) + longerName + input3.charAt(input4 - 1) + input3.charAt(input3.length()-input4);


        StringBuilder newStr=new StringBuilder(userId);

        for(int i = 0; i < userId.length(); i++) {
            if(Character.isLowerCase(userId.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(userId.charAt(i)));
            }
            else if(Character.isUpperCase(userId.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(userId.charAt(i)));
            }
        }
        return newStr.toString();
    }
    public static void main(String args[]) {
        String userId = userIdGeneration("Arun", "Chauhan", "160036", 2);
        System.out.println("Generated User ID:"+userId); // Output: RRAJIV75
    }
}