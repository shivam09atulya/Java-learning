package com.shivam09;
import java.util.Scanner;

class Example{
    int x=5;
    static  int y=6;

    void fun1()
    {
        System.out.println("Value of y = "+y);
        System.out.println("Value of x = "+x);
    }
}
public class Main {
    int x=5;
    static  int y=6;

    void fun2()
    {
        System.out.println("Value of y = "+y);
        System.out.println("Value of x = "+x);

    }

    public static void main(String[] args) {
       /* teacher teach=new teacher();
        teach.teacher();
        teach.teacher(5);
        student study=new student();
        study.student();
        study.teacher();*/
        Example ex1=new Example();
        ex1.fun1();
        System.out.println("x in main"+ex1.x);
        }
}

