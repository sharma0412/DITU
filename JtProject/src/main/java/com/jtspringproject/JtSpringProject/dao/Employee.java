package com.jtspringproject.JtSpringProject.dao;

 class Employee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s){
        id = i;
        name = n;
        salary = s;

    }
    void display(){
        System.out.println(id+""+name+""+salary+"");
    }
    public class TestEmployee{
        public void main(String[] args){
            Employee e1 = new Employee();
            Employee e2 = new Employee();
            Employee e3 = new Employee();
            e1.insert(101,"Karan",45000);
            e2.insert(103,"Harjeet",45000);
            e3.insert(104,"Sanjeev",45000);
            e1.display();
            e2.display();
            e3.display();
        }
    }
}
