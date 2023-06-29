package com.jtspringproject.JtSpringProject;

public class PriceDetail {
    static String Employee_name;
    static Float Employee_salary;

    static void set(String n, float p ){
        Employee_name = n;
        Employee_salary = p;

    }
    static void get(){
        System.out.println("Employee name is " + Employee_name);
        System.out.println("Employee salary is " + Employee_salary);
    }

    public static void main(String[] args){
        PriceDetail.set("Avinash", 10000);
        PriceDetail.get();


        }

    }
