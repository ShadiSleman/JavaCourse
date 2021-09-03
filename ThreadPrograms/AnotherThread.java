package ThreadPrograms;

import static ThreadPrograms.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from "+currentThread().getName());
        try{
            Thread.sleep(2000); // Thread.sleep(millis)
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");

    }
}
