package com.obifyconsulting.com.twenty.threads;

public class ThreadExample2Main {
    public static void main(String[] args) {
        new ThreadDemoTwo("1st thread");
        new ThreadDemoTwo("2nd thread");
        new ThreadDemoTwo("3rd thread");

        try
        {
            Thread.sleep(8000);


        }
        catch (InterruptedException e){
            System.out.println("Main Method Interrupted ");
        }
        System.out.println("Exit from  main thread");
    }
}
