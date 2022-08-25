package com.bridgelabz.thread;

public class CharacterRunnable implements Runnable {
//boolean isFinish = false;

    //    @Override
    public void run() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
//            if(i=='z'){
//                Main.isFinish=true;
//            }
//        }
            //isFinished = true;
            System.out.println("Bye from char thread");
        }
    }
}