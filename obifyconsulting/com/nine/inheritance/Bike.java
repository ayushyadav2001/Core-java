package com.obifyconsulting.com.nine.inheritance;

public class Bike extends Vehicle {

    public Bike(){
        //super(); call default constructor of the super class i.e vehicle
        super("hdfcds");
        System.out.println("Default constructor from Bike");
        super.setVehicleType("Bike is a Two Wheel ");
    }
    public void display(){
        System.out.println(super.getVehicleType());
        System.out.println(super.regNo);
    }

    @Override
    public void show(){
        System.out.println("I am Child class of bike");
    }
}
