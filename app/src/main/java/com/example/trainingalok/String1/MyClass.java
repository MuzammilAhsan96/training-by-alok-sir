package com.example.complexapp;

import java.lang.*;
import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        String s="987678959123432109012343",st="";
        int flag=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            int a=0;
            for (int j=s.length()-1;j>=i;j--)
            {
                st=s.substring(a++,i+a);
                StringBuilder input = new StringBuilder();
                input.append(st);
                if(input.toString().equals(input.reverse().toString()))
                {
                    System.out.println("Longest palindrome= "+input);
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }


        }







    }
}