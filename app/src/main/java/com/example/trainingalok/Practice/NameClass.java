package com.example.trainingalok.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NameClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<String > names=new ArrayList<>();  //List Creation
        names.add("raj");   //Adding Elements
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

        NameClass obj=new NameClass();  //Object Creation

        System.out.println("Enter string to be searched");
        String s=sc.nextLine();

        s=s.trim().toLowerCase();


        List<String> ls=obj.findNames(names,s);
        System.out.println(ls);


        List<String> names2=new ArrayList<>();
        names2.add("muzammil");
        names2.add("muzakkir");
        names2.add("sachin");
        names2.add("raj");
        names2.add("koko");

        List<String> ls1=obj.compareNames(names,names2);
        System.out.println(ls1);

        System.out.println("Enter page number");
        int page=sc.nextInt();
        int a= obj.printpart(page);
        if(a!=0)
        {
            System.out.println("Part Number = "+a);
        }
        else
        {
            System.out.println("Partition does not exist for given page ");
        }
        List<Integer> ar=new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(15);
        int sum=obj.addList(ar);
        System.out.println("Sum="+sum);

    }
    public List<String> findNames(List<String> names,String s)  //Print the names which contains string s
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
    public List<String > compareNames(List<String> names1,List<String> names2)  //Print the union of the lists
    {
        List<String > ls=new ArrayList<>();
        int size1=0,size2=0;
        if(names1.size()>names2.size())
        {
            size1=names1.size();
            size2=names2.size();
        }
        else
        {
            size1=names2.size();
            size2=names1.size();
        }
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                if(names1.get(i).equals(names2.get(j)))
                {
                    ls.add(names1.get(i));
                }
            }
        }
        return ls;
    }
    public int printpart(int n) //Print the part of the book by knowing page number as parameter. Each part has 10 pages
    {
        if(n<1)
        {
            return 0;
        }
        int a=n/10;
        if(n%10==0)
        {
            a=a-1;
        }
        return a+1;
    }
    public int addList(List<Integer> ls)    //This function return the sum of all the elements present in integer list
    {
        int sum=0;
        for(int i=0;i<ls.size();i++)
        {
            sum=sum+ls.get(i);
        }
        return sum;
    }
}
