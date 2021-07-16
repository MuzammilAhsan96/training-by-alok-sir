package com.example.trainingalok.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AClass {
    public void callChoice(int choice)throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int q=0;
        do {
            if (choice == 1) {
                BClass ob1=new BClass();
                ob1.operation();
                q=1;

            } else if (choice == 2) {
                int ch;
                CClass ob2 = new CClass();
                ob2.form();

                q=1;
            } else {
                System.out.println("Wrong Choice");
            }
        }while (q==0);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 1 for operation \n2 for form");
        int choice = Integer.parseInt(sc.readLine());
        AClass ob=new AClass();
        ob.callChoice(choice);

    }
}
