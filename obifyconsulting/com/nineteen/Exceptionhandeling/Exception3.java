package com.obifyconsulting.com.nineteen.Exceptionhandeling;

public class Exception3 {
    public static void main(String[] args) {
        int []b=new  int[]{1,2,3,4,5};
        display(b);

    }
    public static void display(int []a)
    {
        try{
            for (int i=0;i<=a.length;i++){
                System.out.println(a[i]);
            }
        }
        catch (Exception e)
        {
            System.out.println("Array Index out of bound");
        }
    }
}
