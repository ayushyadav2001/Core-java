package com.obifyconsulting.com.twenty.threads;

public class ThreadOne extends Thread {
    @Override
    public void run()
    {
        int a=3;
        int b=5;
        int c=a+b;
        System.out.println("Thread is Started");
        System.out.println("The SUm is :"+c);
    }
}
