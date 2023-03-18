package com.obifyconsulting.com.nineteen.Exceptionhandeling;

public class Exception4Main {
    public static void main(String[] args) {
        calculate(5,2);
        calculate(5,0);


    }
    public static void  calculate(int a,int b)
    {
        int c=0;
        try{
            c=a/b;
            System.out.println(c);
        }
        finally {
            System.out.println("Inside Finaly block ");
        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
        System.out.println("exit from calculate function ");

    }
}
