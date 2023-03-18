package com.obifyconsulting.com.seven.polymorphism;

public class Area {

    public double calculateArea(double radius){
        return (3.14*radius*radius);

    }
    public double calculateArea(double height,double width){
        return (0.5*height*width);
    }
    public double calculateArea(double height,double width,String name){
        System.out.println(name);
        return (0.5*height*width);
    }

}
