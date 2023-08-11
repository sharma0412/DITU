package com.jtspringproject.JtSpringProject;

import java.util.Scanner;

public class Paypal {


    String screatKey;

    String createKey;


    public String getCreateKey() {
        return createKey;
    }

    public void setCreateKey(String createKey) {
        this.createKey = createKey;
    }


    public String getScreatKey() {
        return screatKey;
    }

    public void setScreatKey(String screatKey) {
        this.screatKey = screatKey;
    }



    String s="200";
    //Converting String into int using Integer.parseInt()
    int i=Integer.parseInt(s);
    Scanner scan=new Scanner(System.in);

    //reading value from the user
    int num=scan.nextInt();
    //method calling

}
