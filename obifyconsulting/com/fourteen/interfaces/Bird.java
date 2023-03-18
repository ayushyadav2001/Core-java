package com.obifyconsulting.com.fourteen.interfaces;

public class Bird implements Animal,SuperAnimal {    //  example of multiple inheritance
    @Override
    public void speak(){
        System.out.println("chirp");
    }
}
