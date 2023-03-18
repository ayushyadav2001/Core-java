package com.obifyconsulting.com.eighteen.list;

import java.util.*;

public class EmpMain  extends Employee{
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        List<Employee> empList2 = new ArrayList<Employee>();  //Dynamic polymorphism
        Employee emp1=new Employee();
        emp1.setEmpId(1111L);
        emp1.setEmpname("Ayush Yadav");
        empList2.add(emp1);

        Employee emp2=new Employee();
        emp2.setEmpId(2222L);
        emp2.setEmpname("John Doe");
        empList2.add(emp2);

        Employee emp3=new Employee();
        emp3.setEmpId(4444L);
        emp3.setEmpname("Nikhil Kumar");
        empList2.add(emp3);
        for (Employee e:empList2){
            System.out.println("Employee with Employee ID "+e.getEmpId()+" is "+ e.getEmpname());

        }

    }
    }

