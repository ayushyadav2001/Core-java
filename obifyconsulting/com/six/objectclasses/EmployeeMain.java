package com.obifyconsulting.com.six.objectclasses;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmployeeId");
        long EmpId=sc.nextLong();
        System.out.println("Enter Salary");
        double salary=sc.nextDouble();
        Employee ram =new Employee();
        ram.setEmployeeId(EmpId);
        ram.setSalary(salary);
        System.out.println(ram.getEmpId());
        System.out.println(ram.getSalary());
        System.out.println(ram);

    }
}
