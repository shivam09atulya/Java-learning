package com.shivam09;

public class student extends teacher{
    student()
    {
        System.out.println("student constructor");
    }
   void student()
   {
       System.out.println("student void constructor");
   }
   void student (int a)
   {
       teacher();
       System.out.println("above called teacher");
   }
}
