package ThreadPrograms;

import static ThreadPrograms.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println(ANSI_RED + "Heloo from MyRunnable ");
    }
}
