package com.bobsystem.behavioral.responsibility;

public class ConcreateChainB
    extends AChain {

    @Override
    public void process(int data) {

        if(data >= 10 && data < 20) {
            System.out.println("ConcreateHandlerB success");
        }
        else {
            super.chain.process(data);
        }
    }
}
