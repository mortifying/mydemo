package com.mydemotest;

import sun.misc.Signal;
import sun.misc.SignalHandler;

/**
 * mydemo
 * Created by yusb on 2018-12-21
 */
public class KillSignalHandler implements SignalHandler {


    private boolean flag = true;
    public void registerSignal(String signalName){
        Signal signal = new Signal(signalName);
        Signal.handle(signal, this);
    }


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void handle(Signal signal) {

        System.out.println(signal.getName());
        if(signal.getName().equals("TERM")){
            System.out.println("处理TERM信号....");
        }else if(signal.getName().equals("INT")){
            System.out.println("处理INT信号....");
            setFlag(false);
        }
    }
}