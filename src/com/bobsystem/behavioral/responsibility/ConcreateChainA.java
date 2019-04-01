package com.bobsystem.behavioral.responsibility;

public class ConcreateChainA
    extends AChain {

    @Override
    public void process(int data) {

        if(data >= 0 && data < 10) {
            System.out.println("ConcreateHandlerA success");
        }
        else {
            super.chain.process(data);
        }
    }
}
