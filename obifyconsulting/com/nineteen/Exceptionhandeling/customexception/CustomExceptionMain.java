package com.obifyconsulting.com.nineteen.Exceptionhandeling.customexception;

import java.io.IOException;

public class CustomExceptionMain {
    static void validate(int age) throws InvalidAgeException , IOException
    {
        if(age<18)
        {
            InvalidAgeException ia  =new InvalidAgeException("not valid");
            throw ia;
        }
        else {
            System.out.println("Welcome to Vote");
        }
        throw new IOException();

    }

    public static void main(String[] args) {
        try
        {
            validate(14);
            System.out.println("not reachable");
        }
        catch (InvalidAgeException m)
        {
            System.out.println("You are not allowed to vote due to your age is less than 18"+m);
        }
        catch (IOException i){
            System.out.println("Io exception :"+i);
        }
        catch (Exception e)
        {
            System.out.println("Exception "+e);
        }
        System.out.println("Rest of the code");
    }
}
