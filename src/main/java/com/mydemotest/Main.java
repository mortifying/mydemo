package com.mydemotest;



import static java.lang.Thread.sleep;

/**
 * mydemo
 * Created by yusb on 2018-12-21
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("start...........");
        KillSignalHandler killSignalHandler = new KillSignalHandler();
        killSignalHandler.registerSignal("TERM");
        killSignalHandler.registerSignal("INT");
        //killSignalHandler.registerSignal("");


        while (killSignalHandler.isFlag()){

            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //System.out.println("end.............");
    }
}
