package com.obifyconsulting.com.seven.polymorphism;

public class Main {
    public static void main(String args[]){
        Area circle=new Area();
        System.out.println( "Area of Circle is : "+circle.calculateArea(2));
        Area triangle=new Area();
        System.out.println( "Area of Triangle is : "+triangle.calculateArea(2,4));
        Area area=new Area();
        System.out.println( "Area of area with nname is : "+area.calculateArea(2,2,"Ayush"));

    }
}
