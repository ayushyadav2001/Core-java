package com.obifyconsulting.com.eighteen.list.SetPkg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // allow to add null values
        Set<Integer> rolls=new HashSet<>();// hash we can add null
//        Set<Integer>rolls1=new TreeSet<>(); tree implements Sorted Set
        rolls.add(1);
        rolls.add(2);
        rolls.add(3);
        rolls.add(4);
        rolls.add(99);
        rolls.add(null);

        for (int i=0;i< rolls.size();i++){
            System.out.println(rolls);
        }
        for (int a:rolls)
        {
            System.out.println(a);
        }
        System.out.println("Size is "+rolls.size());
        rolls.clear();
        rolls.add(22);
        rolls.add(334);
        System.out.println("Size is "+rolls.size());

    }
}
