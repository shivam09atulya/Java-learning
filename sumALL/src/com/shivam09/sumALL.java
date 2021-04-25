package com.shivam09;
public class sumALL {
    public static void main(String args[]){
        int sum=0;
        for(int i=0;i< args.length;i++)
        {
            int val=Integer.parseInt(args[i]);
            sum = val+sum;
        }
        System.out.println(sum);
    }

}
