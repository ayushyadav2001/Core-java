package com.obifyconsulting.com.eighteen.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List <String> fruitList=new ArrayList<String>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Orange");

        System.out.println(fruitList.get(1));
        fruitList.add("Graps");
        System.out.println(fruitList.get(2));

        System.out.println(fruitList.size());
        fruitList.remove("Apple");
        fruitList.add(2,"Orange");
        for (String s:fruitList){
            System.out.println(s);
        }
        if (fruitList.contains("Mango"))
        {
            System.out.println("Its Present");
        }
        else {
            System.out.println("Its not Present");
        }
        if (fruitList.isEmpty()){
            System.out.println("List is Empty !");
        }
        else {
            System.out.println("Not Empty List");
        }
        fruitList=new LinkedList<>();// Dynamic polymorphism

    }
}
