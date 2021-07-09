package com.example.trainingalok.Practice;

import java.util.Scanner;

public class Prime {
    public void printPrime(int start,int end)
    {
        System.out.println("Prime Numbers are:-");
        for(int i=start;i<=end;i++)
        {
            int count=0;
            for (int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0&&i>1)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start value:-");
        int start=sc.nextInt();
        System.out.println("Enter end value:-");
        int end=sc.nextInt();
        Prime obj=new Prime();
        obj.printPrime(start,end);
    }
}
