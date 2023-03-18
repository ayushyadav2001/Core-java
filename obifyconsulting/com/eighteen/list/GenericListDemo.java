package com.obifyconsulting.com.eighteen.list;

import java.util.ArrayList;

public class GenericListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numList=new ArrayList<Integer>();
        ArrayList<String> nameList=new ArrayList<String>();
        numList.add(2333);
        numList.add(2222);
        numList.add(23232);
        numList.add(123355);
        numList.add(212322);
        numList.add(11111);

        nameList.add("ayush");
        nameList.add("Vikas");
        nameList.add("Chandan");
        nameList.add("arpit");
        nameList.add("nikhil");
        for(Object a:numList){
            System.out.println("Number List is :"+a);
        }
        System.out.println("----------------------------------");

        for(Object b:nameList){
            System.out.println("Number List is :"+b);
        }

    }
}
