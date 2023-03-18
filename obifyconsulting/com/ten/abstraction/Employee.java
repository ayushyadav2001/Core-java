package com.obifyconsulting.com.ten.abstraction;

public abstract class Employee {
    private  String companyName="abc Private Limited";

    public String getCompanyName(){
        return this.companyName;
    }
    public abstract double calculateSalary(String employmentType);

}
