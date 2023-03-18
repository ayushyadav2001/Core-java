package com.obifyconsulting.com.nineteen.Exceptionhandeling;

public class Exception2Main {
    public static void main(String[] args) {
//    String s1= new String("Hii I am Valid String");
        String s1="Hi am Valid String";
    String s2=null;
    display(s1);
    display(s2);

    }
    public static void display(String s)
    {
        try
        {
            System.out.println(s.length());

        }
        catch (Exception e)
        {
            System.out.println("Null pointer Exception");
        }
    }
}
