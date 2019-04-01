package com.bobsystem.behavioral.responsibility;

public class ConcreateChainC
    extends AChain {

    @Override
    public void process(int data) {

        if(data >= 20 && data < 30){
            System.out.println("ConcreateHandlerC success");
        }
        else {
            System.out.println("处理不了，去死");
        }
    }
}
