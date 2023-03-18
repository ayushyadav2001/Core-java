package com.obifyconsulting.com.six.objectclasses;

public class Employee {
        long employeeId;// state variable
        double salary;//state variable

        //behaviour
        void setEmployeeId (long eid)
        {
            employeeId=eid;

        }
        void setSalary(double s)
        {
            salary=s;
        }
        long getEmpId()
        {
            return employeeId;
        }
        double getSalary (){
            return salary;
        }
        //override the toString Method
    @Override
    public String toString(){
            String s="Employee Id is = "+ employeeId+"  ans Salary is ="+salary;
            return s;
    }


}
