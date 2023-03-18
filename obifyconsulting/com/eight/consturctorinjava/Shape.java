package com.obifyconsulting.com.eight.consturctorinjava;

public class Shape {
    int length;
    int breadth;
    String shapeName;

    public Shape()
    {
        System.out.println("Default constructor");
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeName);
    }

    public Shape(int length ,String shapeName)
    {
        this.length=length;
        this.shapeName=shapeName;

        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeName);
        System.out.println("two parameterised constructor");
    }

    public Shape(int length ,String shapeName,int breadth)
    {
        this.length=length;
        this.shapeName=shapeName;
        this.breadth=breadth;

        System.out.println(length);
        System.out.println(breadth);
        System.out.println(shapeName);
        System.out.println("Three parameterised constructor");
    }
    class InnerShape{
        int matrices=6789;
        void display(){
            System.out.println("Inner Class");
            System.out.println(matrices);
        }

    }
}

