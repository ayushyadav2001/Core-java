package com.obifyconsulting.com.nine.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.display();
        Car car=new Car(89065);
        car.showDetails();
        System.out.println("*/-------------------------------------------------*/");
        Vehicle vehicle=new Vehicle();
        vehicle.show();

        vehicle=new Bike();// vehicle is pointing toward bike object
        vehicle.show();

        vehicle=new Car();
        vehicle.show();
    }
}
