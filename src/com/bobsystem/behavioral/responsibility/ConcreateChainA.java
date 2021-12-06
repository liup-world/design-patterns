package com.bobsystem.behavioral.responsibility;

public class ConcreateChainA
    extends AChain {

    public ConcreateChainA(AChain chain) {
        super(chain);
    }

    @Override
    public void process(int data) {
        if (data >= 0 && data < 10) {
            System.out.println("A success. data = " + data);
            return;
        }
        AChain chain = super.chain;
        if (chain != null) {
            super.chain.process(data);
        }
    }
}
