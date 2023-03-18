package com.obifyconsulting.com.nineteen.Exceptionhandeling;

public class Exception1Main {
    public static void main(String[] args) {
    calculate(5,2);
    calculate(5,0);

    }
    public static void calculate(int a ,int b){
        try
        {
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println( "Some Thing went wrong :"+e);

        }
        System.out.println("Exit from Calculate Function");
    }
}
