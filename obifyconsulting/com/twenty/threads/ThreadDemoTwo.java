package com.obifyconsulting.com.twenty.threads;

public class ThreadDemoTwo implements Runnable {
    String name;
    Thread thread;
    public ThreadDemoTwo(String name)
    {
        this.name=name;
        thread =new Thread(this,name);
        System.out.println("New Thread "+thread+"is Created");
        thread.start();
    }
    @Override
    public void run()
    {
        try
        {
            for (int j=5;j>0;j--)
            {
                System.out.println("Name is : "+j);
                Thread.sleep(1000);
            }

        }
        catch (InterruptedException e){
            System.out.println(name+"thread interrupted");
        }
        System.out.println(name+ "Exit from thread ");
    }

}
