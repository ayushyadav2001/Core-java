package com.obifyconsulting.com.seventeen.accessmodifiers.accmodone;

public class Cat extends Animal {

    public void display()
    {
        Animal animal = new Animal();
        System.out.println(animal.canFly);//protected members can also be accessed within the child classes of same package
    }
}