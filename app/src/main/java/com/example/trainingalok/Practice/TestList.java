package com.example.trainingalok.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestList {
    public int findPosition(List<Integer> ls,int element)
    {
        int pos=-1;
        pos=ls.indexOf(element);
        return pos;
    }

    public void replaceElement(List<Integer> ls,int pre,int suc)
    {
        int index=findPosition(ls,pre);
        if(index!=-1)
        {
            ls.set(index,suc);
        }
    }
    public void reverseFun(List<Integer> ls)
    {
        Collections.reverse(ls);
    }
    public void delete(List<Integer> ls,int ele)
    {
        int i=findPosition(ls,ele);
        ls.remove((i));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        TestList obj=new TestList();

        List<Integer> list=new ArrayList<>();
        System.out.println("Enter 5 elements");
        for(int i=0;i<5;i++)
        {
            list.add((sc.nextInt()));
        }
        System.out.println("Enter element to search!!");
        int ele=sc.nextInt();
        int pos=obj.findPosition(list,ele);
        if(pos!=-1)
            System.out.println("Element is present at position = "+(pos+1));
        else
            System.out.println("Element is not present");

        System.out.println("Enter element to replace and the element to replace with");
        int predecessor=sc.nextInt();
        int successor=sc.nextInt();

        System.out.println("List before replacing element= "+list);

        obj.replaceElement(list,predecessor,successor);

        System.out.println("List after replacing element= "+list);

        obj.reverseFun(list);

        System.out.println("Reversed List= "+list);

        System.out.println("Size of List= "+list.size());

        System.out.println("Enter element to delete!!");
        int e=sc.nextInt();
        obj.delete(list,e);
        System.out.println("List after deleting element= "+list);
        System.out.println("Size of List= "+list.size());
    }
}
