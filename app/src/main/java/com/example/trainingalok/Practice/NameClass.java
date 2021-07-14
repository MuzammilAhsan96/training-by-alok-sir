package com.example.trainingalok.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NameClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<String > names=new ArrayList<>();
        names.add("raj");
        names.add("ajay");
        names.add("alok");
        names.add("ashish");
        names.add("umesh");
        names.add("muzammil");
        names.add("ravi");
        names.add("prakhar");
        names.add("anmol");
        names.add("riya");
        names.add("aysha");
        names.add("satish");
        names.add("noor");
        names.add("farhan");
        names.add("muzakkir");
        names.add("zaid");
        names.add("subhan");
        names.add("adnan");
        names.add("nikhil");
        names.add("ashutosh");

        System.out.println("Enter string to be searched");
        String s=sc.nextLine();

        s=s.trim().toLowerCase();
        NameClass obj=new NameClass();

        List<String> ls=obj.findNames(names,s);
        System.out.println(ls);

    }
    public List<String > findNames(List<String> names,String s)
    {
        List<String > ls=new ArrayList<>();
        for(int i=0;i<names.size();i++)
        {
            if(names.get(i).contains(s))
            {
                ls.add(names.get(i));
            }

        }
        return ls;
    }
}
