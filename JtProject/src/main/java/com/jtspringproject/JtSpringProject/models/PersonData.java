package com.jtspringproject.JtSpringProject.models;

public class PersonData {


    static void myStaticMethod()
    {
        System.out.println("Static method can be called without creating object");
    }
    public void myPublicMethod(){
        System.out.println("Public method must be called by creating objects");
    }
    public static void main(String[] args){
        myStaticMethod();

        PersonData myObj = new PersonData();
        myObj.myPublicMethod();
    }

}
