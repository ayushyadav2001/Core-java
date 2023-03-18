package com.obifyconsulting.com.twelvee;

public class StaticPractise {
    static int a=10;
    static int b;
    int empId=555;

    static {
        System.out.println("Static block initialized");
        b=a*4;
    }
    {
        b=a*10;
    }
    {
        System.out.println("I am Not a Static block");
    }
    public StaticPractise(){
        System.out.println("Default Constructor Called");
    }
    static void m1(){
        System.out.println("Inside M1");
    }
    public void show(){
        System.out.println("Value of a is :"+this.a);
        System.out.println("Value EmpId  is :"+this.empId);
    }
    public static void display()
    {
        System.out.println("Value of a is :"+a);
    }

    public static void main(String[] args) {
        System.out.println("From Maine");
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);
        StaticPractise sp1=new StaticPractise();
        sp1.empId=666;
        sp1.a=99;
        StaticPractise sp2=new StaticPractise();
        System.out.println("Value of Sp2 is :"+sp2.a);
        System.out.println("Static Practise :"+StaticPractise.a);
        StaticPractise.display();
        display();
        System.out.println("value of sp2.empid is : "+sp2.empId);





    }
}
