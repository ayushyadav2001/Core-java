package com.obifyconsulting.com.eighteen.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList numberList=new ArrayList();
        numberList.add("Yellow Ball");
        numberList.add("Blue Ball");
        numberList.add("Pink Ball");
        numberList.add("Green Ball");
        numberList.add(88.97);
        numberList.add("orange Ball");
        numberList.add(2005);

        for (int i=0;i<numberList.size();i++){
            System.out.println("Color of Balls is :"+numberList.get(i));

        }
        System.out.println("-----------------------------------------");
        for (Object a :numberList){
            System.out.println("Color of balls : "+a);
        }


    }
}
