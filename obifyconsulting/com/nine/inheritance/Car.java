package com.obifyconsulting.com.nine.inheritance;

public class Car extends Vehicle {
    public long buildNumber;
    public Car(){
//        super(); Vehicle default constructor
        System.out.println("Default constructor of Car");
        super.setVehicleType("Car is four wheeler vehicle");
    }
    public Car(long buildNumber){
        this(); // call the default constructor
        this.buildNumber=buildNumber;
    }
    public Car (String a, long xyz)
    {
        this(10L);
    }
    public void showDetails(){
        System.out.println(getVehicleType());
        System.out.println("Build Number of Card is :"+this.buildNumber);
    }
    @Override
    public void show(){
        System.out.println("I am the child class car");
    }

}
