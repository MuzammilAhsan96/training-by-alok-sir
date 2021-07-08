package com.example.trainingalok.String1;
import java.util.*;
public class Count1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                c++;
            }
        }
        System.out.println("No. of Words="+c);
    }
}
