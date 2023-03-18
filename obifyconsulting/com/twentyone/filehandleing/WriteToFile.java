package com.obifyconsulting.com.twentyone.filehandleing;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter myWriter =null;
        try
        {
           myWriter= new FileWriter("Demo.txt");
            myWriter.write("Hello I am Writing the in File\n");
            myWriter.write("Hello i am Learning java backend\n");

            myWriter.close();
            System.out.println("Successfully Wrote in this file");


        }
        catch (IOException e)
        {
            System.out.println("Some Error Occurred ");
            e.printStackTrace();

        }
        finally {
            myWriter.close();
        }

    }
}
