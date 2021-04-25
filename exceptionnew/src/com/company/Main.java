package com.company;

class Main{
    public static void main(String[] args)
    {
        int i=1,j=4;
        try{
            int k=i/j;
            if(k==0)
            throw new Shivam();
        }
        catch (Exception e)
        {
            System.out.println("Exception handled successfully");
        }
        finally {
            System.out.println("Tadaa");
        }
    }
}