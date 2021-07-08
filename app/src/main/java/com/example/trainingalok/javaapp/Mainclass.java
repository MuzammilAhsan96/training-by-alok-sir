package com.example.trainingalok.javaapp;

public class Mainclass implements Intt, Int1{
    public static void main(String []args){
        String s= new String("hi");
        String s1=new String("hi");
        String k="hi";
        System.out.println(s.hashCode()+"    "+s1.hashCode()+"    "+k.hashCode());
        Int1 i=new Mainclass();
        i.all();
        i.hi();
        Intt i2=new Mainclass();
        i2.all();
    }
    @Override
    public void all() {
        //Intt.super.all();
        //Int1.super.all();
    }


    @Override
    public void hi() {

    }


}
