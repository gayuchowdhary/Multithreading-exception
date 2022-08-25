package com.bridgelabz.thread;

public class Main {
//    public static boolean isFinish=false;
    public static void main(String[]args){
        NumberThread numberThread = new NumberThread();
        numberThread.start();       //start method leads the to start new thread

        CharacterRunnable characterRunnable = new CharacterRunnable();
        Thread characterThread = new Thread(characterRunnable);     //obj pass as parameter
        characterThread.start();
        numberThread.setDaemon(true);
//        characterThread.stop();
//        System.out.println(characterThread.getName()  + " is finished now");

        //As main thread finishes here,so only three threads
        //num,char and garbage
        System.out.println("Bye from main thread");
    }
}