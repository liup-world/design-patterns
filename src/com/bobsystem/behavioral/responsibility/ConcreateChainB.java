package com.bobsystem.behavioral.responsibility;

public class ConcreateChainB
    extends AChain {

    public ConcreateChainB(AChain chain) {
        super(chain);
    }

    @Override
    public void process(int data) {
        if(data >= 10 && data < 20) {
            System.out.println("B success. data = " + data);
            return;
        }
        AChain chain = super.chain;
        if (chain != null) {
            super.chain.process(data);
        }
    }
}
