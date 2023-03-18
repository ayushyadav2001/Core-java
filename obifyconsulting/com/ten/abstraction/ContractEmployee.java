package com.obifyconsulting.com.ten.abstraction;

public class ContractEmployee extends Employee{
    @Override
    public double calculateSalary(String employmentType) {
        double tax=0.3;
        double grossSalary=80000;
        double netSalary=0.0;
        if(employmentType.equalsIgnoreCase("Contractual"))
        {
            netSalary=grossSalary-(grossSalary*tax);
            netSalary=netSalary-5000;  //5000 for deduction  for contract employee
        }
        return netSalary;
    }

}
