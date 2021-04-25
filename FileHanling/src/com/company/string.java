package com.company;
import java.lang.String;

public class string {
    public static void main(String [] args)
    {
        String joinString1=String.join("-","welcome","to","java");
        System.out.println(joinString1);

        String s1="";
        String s2="java";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        String s3="learning java";
        String s4=s3.replace('a','e');
        System.out.println(s4);

        String s5="split function using java";
        String []words=s5.split("\\s");
        for(String w:words) {
            System.out.println(w);
        }

        String s7="ShivamAtulya";
        System.out.println(s7.substring(6));
        System.out.println(s7.substring(0,6));
        }



    }

