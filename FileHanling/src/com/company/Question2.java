package com.company;

import java.util.*;
import java.io.*;
public class Question2 {
    public static void main(String [] args)
    {
        StringBuffer str=new StringBuffer("Java is my favorite Programming Language");
        str.append("YESS");
        System.out.println(str);
        str.insert(4," and C++");
        System.out.println(str);
        str.delete(0,9);
        System.out.println(str);
        System.out.println(str.capacity());
        str.ensureCapacity(60);
        System.out.println(str.capacity());
        System.out.println(str.reverse());
    }
}
