package com.shivam09;

import java.util.Scanner;

public class Calculator {
    int result,a,b;
    Scanner in=new Scanner(System.in);

    public void values()
    {
        System.out.println("Enter the values of a & b =");
        a=in.nextInt();
        b=in.nextInt();

    }

    public void add()
    {
        values();
        result=a+b;
        System.out.println(result);
    }

    public void sub()
    {

        result=a-b;
        System.out.println(result);
    }

}

