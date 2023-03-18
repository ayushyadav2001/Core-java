package com.obifyconsulting.com.nine.inheritance;

public class Vehicle {

    private String vehicleType;
    final long regNo=0;
    public Vehicle(){
        System.out.print("Default Constructor from super class Vehicle");
    }
    public Vehicle(String a){
        System.out.println("One parameter Constructor from super class Vehicle");
        System.out.println(a);
    }
   public String getVehicleType(){
        return vehicleType;
   }
   public void setVehicleType(String VehicleType)
   {
        this.vehicleType=vehicleType;
   }
   public  void show(){
        System.out.println("I am a parent class vehicle");
   }


}
