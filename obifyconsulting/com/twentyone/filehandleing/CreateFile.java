package com.obifyconsulting.com.twentyone.filehandleing;

import  java.io.IOException;
import java.util.Arrays;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        try
        {
            File myObj=new File("Demo.txt");

            if(myObj.createNewFile())
            {
                System.out.println("File Created Successfully"+myObj.getName());
                System.out.println("File Path is : "+myObj.getPath());
                System.out.println("File Path is : "+myObj.getAbsolutePath());
                System.out.println("File Path is : "+myObj.getCanonicalPath());


            }
            else {
                System.out.println("File Already Exist");
                System.out.println("File Path is : "+myObj.getPath());
                System.out.println("File Path is : "+myObj.getAbsolutePath());
                System.out.println("File Path is : "+myObj.getCanonicalPath());


            }

        }catch (IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();

        }
    }
}
