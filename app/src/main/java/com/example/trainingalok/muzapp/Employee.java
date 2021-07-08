package com.example.trainingalok.muzapp;

public class Employee {
    public String empID;
    public String name;
    public final static int m=1;
    public final int m2=2;
    Employee()
    {
        this.empID="1";
        this.name="Muz";

    }
    Employee(String empID,String name)
    {
        this();
        this.empID=empID;
        this.name=name;

    }

    public static void employee(){
        //System.out.println("sadsad");
        int a=5,b=6;
        System.out.println("a="+a+"\nb="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+"\nb="+b);
    }

    public static void main(String []args){
        Employee e = new Employee();
        Employee e1 = new Employee("101","Prakhar");
                //e.employee();
        System.out.println(e1.m);
        System.out.println(e1.m2);
        e1.employee();



    }
}
