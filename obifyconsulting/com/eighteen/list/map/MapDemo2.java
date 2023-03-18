package com.obifyconsulting.com.eighteen.list.map;

import com.obifyconsulting.com.eighteen.list.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Long, Employee> mapOfEmployee=new HashMap<>();
        Employee emp=new Employee();
        emp.setEmpId(1234L);
        emp.setEmpname("Chandan Kr Sharma");
        mapOfEmployee.put(emp.getEmpId(),emp);


        Employee emp1=new Employee();
        emp1.setEmpId(5678L);
        emp1.setEmpname("Nikhil Kumar");
        mapOfEmployee.put(emp1.getEmpId(),emp1);

        Employee resultEmp=mapOfEmployee.get(1234L);
        System.out.println(resultEmp.getEmpname());
        System.out.println(resultEmp.getEmpId());
        for (Map.Entry<Long,Employee> e:mapOfEmployee.entrySet())
        {

//            Employee res1=mapOfEmployee.get(e);
//            System.out.println(res1);
//            Employee result=e.getValue();
            System.out.println("Employee With ID "+e.getKey()+" With Employee Name "+e.getValue().getEmpname());
        }


    }
}
