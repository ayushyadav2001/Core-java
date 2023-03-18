package com.obifyconsulting.com.eleven.array;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        /* int []array={1,2,34,55,6,7,89,};
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }*/
////        Scanner sc= new Scanner(System.in);
//        int intArray[];  dynamic array
////        intArray=new int[5];
//        int [] intArray=new int[]{1,2,3,4,5};
//        int sum=0;
//        for (int i=0;i<intArray.length;i++){
//            sum+=intArray[i];
//            System.out.println("Sum is :"+sum);
//        }

        int[] data=new int[3];
        data[0]=1234;
        data[1]=5678;
        data[2]=9876;
        for(int a:data)
        {
            System.out.println(a);
        }



    }
}
