package com.jtspringproject.JtSpringProject.models;

import org.jboss.jandex.Main;

public class UserData {


    static void myStaticMethod()
    {
        System.out.println("Static method can be called without creating object");
    }
    public void myPublicMethod(){
        System.out.println("Public method must be called by creating objects");
    }
    public static void main(String[] args){
        myStaticMethod();

        UserData myObj = new UserData();
        myObj.myPublicMethod();
    }

}
