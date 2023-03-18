package com.obifyconsulting.com.eight.consturctorinjava;

public class ShapeMain {
    public static void main(String args[]){
//        Shape s=new Shape();  // call default constructor
//        Shape square=new Shape(2,"square");
        Shape triangle =new Shape(2,"triangle",3);

        Shape.InnerShape innerShape =triangle.new InnerShape();
        innerShape.display();

    }
}
