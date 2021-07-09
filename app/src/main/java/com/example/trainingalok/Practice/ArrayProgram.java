package com.example.trainingalok.Practice;

import java.util.Scanner;

public class ArrayProgram {
    public int largest(int arr[])
    {
        int l=Integer.MIN_VALUE;
        for(int index=0;index<arr.length;index++)
        {
            if(l<arr[index])
            {
                l=arr[index];
            }
        }
        return l;
    }
    public int smallest(int arr[])
    {
        int sm=Integer.MAX_VALUE;
        for(int index=0;index<arr.length;index++)
        {
            if(sm>arr[index])
            {
                sm=arr[index];
            }
        }
        return sm;
    }
    public int sumOfElements(int arr[])
    {
        int sum=0;
        for(int index=0;index<arr.length;index++)
        {
            sum=sum+arr[index];
        }
        return sum;
    }
    public int findPosition(int arr[],int element)
    {
        int pos=-1;
        for(int index=0;index<arr.length;index++)
        {
            if(element==arr[index])
            {
                pos=index;
            }
        }
        return pos+1;
    }
    public int findElement(int arr[],int pos)
    {
        int element=0;
        if(pos-1<arr.length)
        {
            return arr[pos-1];
        }
        else
        {
            return -1;
        }
    }
    public void display(int arr[])
    {
        System.out.println("Array Elements are:-");
        for(int index=0;index<arr.length;index++)
        {
            System.out.print(arr[index]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array!");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int index = 0; index < size; index++) {
            arr[index] = sc.nextInt();
        }
        ArrayProgram ob = new ArrayProgram();

        ob.display(arr);

        int max = ob.largest(arr);
        System.out.println("Largest Element in the array is " + max);

        int min = ob.smallest(arr);
        System.out.println("Smallest Element in the array is " + min);

        int sum = ob.sumOfElements(arr);
        System.out.println("Sum of Array Elements is " + sum);

        System.out.println("Enter element to be searched!");
        int ele = sc.nextInt();
        int position = ob.findPosition(arr, ele);
        if (position != 0) {
            System.out.println("Element is present at position = " + position);
        } else
        {
            System.out.println("Element is not present!");
        }

        System.out.println("Enter position to be searched!");
        int pos = sc.nextInt();
        int element = ob.findElement(arr, pos);
        if (element != -1) {
            System.out.println("Element present at position " + pos+ " is "+element);
        } else
        {
            System.out.println("This position is not present!");
        }

    }
}
