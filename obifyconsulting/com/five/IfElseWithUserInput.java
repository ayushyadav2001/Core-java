package com.obifyconsulting.com.five;
import java.util.Scanner;
public class IfElseWithUserInput {
    public static void main(String args[]){

        System.out.println("Please Enter your total marks ");

        Scanner sc=new Scanner(System.in);
        int marks= sc.nextInt();
        if(marks>=0 && marks <15)
        {
            System.out.println("Fail");
        }
        else if(marks>=10 && marks<20)
        {
            System.out.println("A Grade");
        }
        else if(marks>=20 && marks<100)
        {
            System.out.println("B Grade");
        }
        else if(marks>=100 && marks<200)
        {
            System.out.println("C Grade");
        }
        else{
            System.out.println("No Grade");
        }
    }
}
