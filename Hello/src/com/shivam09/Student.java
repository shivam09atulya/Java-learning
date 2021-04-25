package com.shivam09;

import java.util.Scanner;

public class Student {
    Scanner in=new Scanner(System.in);
    String name="shivam";
    void display() {
        System.out.println("Hello again your name please = ");
        name = in.nextLine();
        System.out.println(name);
    }

    public class Teacher extends Student{
        void greet()
        {
            System.out.println("Finally made it ");
            display();
        }
    }

}

