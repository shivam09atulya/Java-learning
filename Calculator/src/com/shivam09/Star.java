package com.shivam09;

public class Star {
    int i,j;
    public void star(int n)
    {
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
