package com.jtspringproject.JtSpringProject.services;

import com.jtspringproject.JtSpringProject.AddToCart;
import com.jtspringproject.JtSpringProject.addition;
import com.jtspringproject.JtSpringProject.models.Product;

public class checkout{
    //defining fields
    int id;//field or data member or instance variable
    String name;
    //creating main method inside the Student class
    public static void main(String args[]){
        //Creating an object or instance

       /* Student s1=new Student();//creating an object of Student
        //Printing values of the object
        System.out.println(s1.id);//accessing member through reference variable
        System.out.println(s1.name);*/

        addition obj=new addition();
        obj.subtraction(4,2);
obj.multiple(5,6);
obj.subtraction(3,7);
obj.multiple(5,6);

        AddToCart obj2=new AddToCart();
        Product obj3=new Product();
        obj.main();
    }
}











