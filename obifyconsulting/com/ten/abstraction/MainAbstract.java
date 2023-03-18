package com.obifyconsulting.com.ten.abstraction;

public class MainAbstract {

    public static void main(String[] args) {

       /* Employee e1=new Employee() {
            @Override
            public double calculateSalary(String employmentType) {
                return 0;
            }
        }*/
        PermanentEmployee p1=new PermanentEmployee();
        ContractEmployee c1=new ContractEmployee();
        String companyName= c1.getCompanyName();

        double salaryPermanentEm= p1.calculateSalary("Permanent");
        double salaryofContractEmp= c1.calculateSalary("Contractual");

        System.out.println("Company Name is :" +companyName);
        System.out.println("Permanent emp salary :" +salaryPermanentEm);
        System.out.println("Contractual  emp salary :" +salaryofContractEmp);



    }


}
