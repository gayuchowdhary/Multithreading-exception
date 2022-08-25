package com.bridgelabz.thread;

public class NumberThread extends Thread {

    //}
//@Override
    public void run() {
        boolean isFinish = false;

        System.out.println("This Thread prints Num from 1 to 100");
        for (int i = 1; i <= 100; i++) {
//        if(Main.isFinish == true){
//            break;
//        }else {
//            System.out.println(i);
//        }

            System.out.println("Bye from Num thread");
        }
    }
}

