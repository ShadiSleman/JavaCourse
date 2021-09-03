package ThreadPrograms;

import static ThreadPrograms.ThreadColor.*;

//Runnable is used more than extend Thread
//need to call the start method
//we have to implement the run() method but we don't call it directly
//the jvm will call it for us
//start()
//run()
//setName(name) and getName();
//Thread.sleep(millis)
//interrupt()
//anotherThread.join() or anotherThread.join(millis)
//synchronized - (public synchronized void doCountdown() - we adding to methond so thread 1 finish the entire thread and then thread 2 get it's chance to do the same .
//synchronized - can be added to specific block and not to entire method

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");
        //need to create new instance of thread
        //and then to call start() in order to execute run() method.

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();// if you do mistake and call run() . it will run for main thread and not for AnotherThread

        //way to create anonymous class
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();
        //way to create anonymous class

        //anonymous class with runnable
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run() ");
            try {
                anotherThread.join(2000) ; // calling the join method
                System.out.println(ANSI_RED +"AnotherThread terminated ,or timed out,so I'm running again");
            }catch (InterruptedException e){
                System.out.println(ANSI_RED+ "I couldn't wait after all , I was interrupted");
            }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();//interrupt() when we use it . we will reach the InterruptedException exception and it will not print the ""Three seconds have passed and I'm awake"


        System.out.println("Hello again from the mail thread");

//        anotherThread.start();//run method must define once and we can't reuse the same instance


    }
}
