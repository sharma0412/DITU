package com.jtspringproject.JtSpringProject.dao;

 class EmployeeNew {
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
         {
            EmployeeNew e1 = new EmployeeNew();
            EmployeeNew e2 = new EmployeeNew();
            EmployeeNew e3 = new EmployeeNew();
            e1.insert(101,"Karan",45000);
            e2.insert(103,"Harjeet",45000);
            e3.insert(104,"Sanjeev",45000);

        }
    }
}
