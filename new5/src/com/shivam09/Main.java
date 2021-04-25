package com.shivam09;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum=0;
        for(int i=0;i< args.length;i++)
        {
            sum+=Integer.parseInt(args[i]);
            System.out.println(sum);
        }

    }
}
