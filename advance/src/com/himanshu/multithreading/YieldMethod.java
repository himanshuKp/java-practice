package com.himanshu.multithreading;

class MyThread1 extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child thread");
      //      Thread.yield();
        }
    }
}

public class YieldMethod {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        
        thread.start();
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Main thread");
        }
    }

}