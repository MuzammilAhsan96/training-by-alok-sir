package com.example.trainingalok.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoWhileProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc=new Scanner(System.in);
        String name;
        int age;
        int tech;
        int ch;
        Map<String,String > ls=new HashMap<>();

        do {
            System.out.println("Enter Name");
            name=sc.readLine();
            System.out.println("Name = "+name);

            System.out.println("Enter Age");
            age=Integer.parseInt(sc.readLine());
            System.out.println("Age = "+age);

            System.out.println("Enter Technology Number\nOptions are:-\n1 - Android\n2 - Flutter\n3 - React\n4 - Node\n5 - IOS");
            tech=Integer.parseInt(sc.readLine());


            switch (tech)
            {
                case 1:System.out.println("Technology = Android");
                    ls.put(name,"Android");
                    break;
                case 2:System.out.println("Technology = Flutter");
                    ls.put(name,"Flutter");
                    break;
                case 3:System.out.println("Technology = React");
                    ls.put(name,"React");
                    break;
                case 4:System.out.println("Technology = Node");
                    ls.put(name,"Node");
                    break;
                case 5:System.out.println("Technology = IOS");
                    ls.put(name,"IOS");
                    break;
                default:System.out.println("Option is incorrect");
            }
            System.out.println("Name = "+name+" and Technology = "+ls.get(name));
            System.out.println("Enter 1 for repeat and 0 for end");
            ch= Integer.parseInt(sc.readLine());


        }while (ch==1);

//        Set<Map.Entry<String, String>> entries = ls.entrySet();
//
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.print("Name: "+ entry.getKey());
//            System.out.println(", Technology: "+ entry.getValue());
//        }

        ls.forEach((k,v) -> System.out.println("Name = " + k + ", Technology = " + v));


        System.out.println("Enter two numbers");
        int n1=Integer.parseInt(sc.readLine());
        int n2=Integer.parseInt(sc.readLine());
        System.out.println("Enter \n+ for addition\n- for substraction\n/ for division\n* for multiplication");
        char c=(char)sc.read();
        double d=operation(n1,n2,c);
        System.out.println("Answer = "+d);

    }
    public static double operation(int a,int b,char opt)
    {
        if(opt=='+')
        {
            return (a+b);
        }
        else if (opt=='-')
        {
            return a-b;
        }
        else if (opt=='/')
        {
            return a/b;
        }
        else if (opt=='*')
        {
            return a*b;
        }
        else
        {
            return 0;
        }

    }
}
