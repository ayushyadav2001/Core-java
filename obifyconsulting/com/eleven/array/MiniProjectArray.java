package com.obifyconsulting.com.eleven.array;

import java.util.Scanner;

public class MiniProjectArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees in your company");
        int numberOfEmp=sc.nextInt();
        int [] empArray=new int[numberOfEmp];
        for(int i=0;i<numberOfEmp;i++)
        {
            System.out.println("Enter the Id of "+(i+1)+" employee");
            empArray[i]=sc.nextInt();
        }
        for (int i=0;i<numberOfEmp;i++){
            System.out.println("Employe id of "+(i+1)+" is : "+empArray[i]);
        }
    }
}
