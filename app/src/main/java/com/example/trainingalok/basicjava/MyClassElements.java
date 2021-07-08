package com.example.trainingalok.basicjava;

public class MyClassElements {
    String name; //non static variables
    static int c = 12;

    //Constructor
    MyClassElements(){
        System.out.println("MyClassElements Constructor Executed");
    }

    //non static method
    public void myFunction(){
        int localvariable = 34;
        System.out.println("Non static myFunction executed "+localvariable);

    }

    //static method
    public static void myNewFunction(){
        System.out.println("myNewFunction executed "+c);

    }

    {
        System.out.println("INIT BLOCK executed");
    }

    static {
        System.out.println("STATIC BLOCK executed");
    }

    public static void main(String []args){
       MyClassElements obj = new MyClassElements();
         obj.myFunction();
        MyClassElements.myNewFunction();
    }
}
