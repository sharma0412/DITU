package com.jtspringproject.JtSpringProject;

import java.util.ArrayList;
import java.util.List;

public class ProductDetail {


    public static void main(String args[]){

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0,2);
        l1.add(1,5);
        System.out.println(l1);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        l1.add(1);
        System.out.println(l2);
    }
}
