package com.shivam09;

abstract class student
{
    private int roll_no;
    private int reg_no;
    public student()
    {
        roll_no=1905247;
        reg_no=12345678;
        System.out.println("Roll No="+roll_no);
        System.out.println("Reg No="+reg_no);
    }
    public abstract String course();
}
class kiitian extends student
{
    private String stream;
    public kiitian()
    {
        super();
        stream="Computer science and engineering";
    }
    public String course()
    {
        return stream;
    }
}
