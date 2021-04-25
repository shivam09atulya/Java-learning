package com.shivam09;

import java.util.Scanner;

public class emp {
    String name,com_name;
    int empID,salary,i=0,n;
    void size()
    {
        System.out.println("Enter the size");
        n=SC.nextInt();
    }


    Scanner SC= new Scanner(System.in);
        void getdata () {
            size();
            for (i = 0; i < n; i++) {
                System.out.println(" ");
                System.out.println("Enter Company name = ");
                com_name=SC.nextLine();
                System.out.print("Enter your name = ");
                name = SC.nextLine();
                System.out.print("Enter empID = ");
                empID = SC.nextInt();
                System.out.print("Enter salary = ");
                salary = SC.nextInt();
                display();
            }
        }
        void display ()
        {
            System.out.println(name);
            System.out.println(empID);
            System.out.println(salary);
        }

}
