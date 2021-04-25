package com.shivam09;
import java.util.Scanner;

public class student {
    String name ,branch,university;
    int roll_number,english,hindi,maths,physics;
    float cgpa,sgpa;
    Scanner SC= new Scanner(System.in);

    void getdata()
    {
        System.out.print("Enter name: ");
        name=SC.nextLine().trim();
        System.out.print("Enter roll no:");
        roll_number=SC.nextInt();
        System.out.print("Enter your branch");
        branch=SC.nextLine().trim();
        System.out.print("Univ:");
        university=SC.nextLine().trim();
        System.out.print("cgpa:".toUpperCase());
        cgpa=SC.nextFloat();
        System.out.println("sgpa:".toUpperCase());
        sgpa=SC.nextFloat();
    }
    void display()
    {
        System.out.println(name);
        System.out.println(roll_number);
        System.out.println(university);
        System.out.println(branch);
        System.out.println(cgpa);
        System.out.println(sgpa);


    }
    void getmarks()
    {
        System.out.print("English marks = ");
        english=SC.nextInt();
        System.out.print("Hindi marks = ");
        hindi=SC.nextInt();
        System.out.print("Maths marks = ");
        maths=SC.nextInt();
        System.out.print("Physics marks = ");
        physics=SC.nextInt();
        avg();

    }
    void avg()
    {
        int sum,avg;
        sum=hindi+english+maths+physics;
        avg=sum/4;
        System.out.println("Your avg marks is "+avg);
    }

}
