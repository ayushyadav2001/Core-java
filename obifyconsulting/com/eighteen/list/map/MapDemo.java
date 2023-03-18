package com.obifyconsulting.com.eighteen.list.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> mapOfEmploye =new HashMap<>();
        mapOfEmploye.put(111,"golu kumar");
        mapOfEmploye.put(222,"Nikhil Kumar");
        mapOfEmploye.put(333,"Chandan Kumar");
        mapOfEmploye.put(null,null);
        mapOfEmploye.put(null,null);
        mapOfEmploye.put(777,null);

        for (Map.Entry<Integer,String>m:mapOfEmploye.entrySet())
        {
            System.out.println(m.getKey()+" "+ m.getValue());
            if(m.getValue()!= null && m.getValue().equals("Nikhil Kumar"))
            {
                System.out.println("Found Nikhil at key :"+m.getKey());
            }
            System.out.println(mapOfEmploye.get(333));
            System.out.println(mapOfEmploye.size());


        }

//        System.out.println(mapOfEmploye.get(1));
    }
}
