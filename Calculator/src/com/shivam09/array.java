package com.shivam09;

import java.util.Scanner;

public class array {
    int i;
    int[]  a=new int[20];
    Scanner in =new Scanner(System.in);
    void createarray(int n) {
        for ( i = 0; i < n; i++) {
            System.out.println("a["+i+"]");
            a[i]=in.nextInt();
        }
        display(n);
    }
    void display(int n)
    {
        for(i=0;i<n;i++)
        {
            System.out.println(" "+a[i]);
        }
    }
}
