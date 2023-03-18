package com.obifyconsulting.com.nineteen.Exceptionhandeling;

public class FinalyBlock {
    public static void main(String[] args) {
        try
        {
            int data=25/5;
            System.out.println(data);

        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block always executed ");
            System.out.println("DaTABASE CLOSING AND finally block executed");

        }
        System.out.println("after finally");
        try
        {
//            System.out.println("Try with finally executed");
            System.exit(0);
        }
        finally {
            System.out.println("finally block will not execute as system.exit");

        }

    }


}
