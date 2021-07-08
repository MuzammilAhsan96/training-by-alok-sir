package com.example.trainingalok.Practice;
import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Maths marks=");
        int maths=sc.nextInt();
        System.out.println("Enter English marks=");
        int english=sc.nextInt();
        System.out.println("Enter Science marks=");
        int science=sc.nextInt();
        double total=maths+english+science;
        total=(total*100)/300;
        if(total>=75.0)
        {
            System.out.println("Selected and proceed for next round!!!");
        }
        else
        {
            System.out.println("Not Selected!!!");
        }


    }
}
