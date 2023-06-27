package com.jtspringproject.JtSpringProject;

public class CartDetail {

    public  static void main (String args[]){
        validate(19);
        try{
            System.out.println("Inside the try block");
            int data=25/0;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
    public static void validate(int age) {


        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}








