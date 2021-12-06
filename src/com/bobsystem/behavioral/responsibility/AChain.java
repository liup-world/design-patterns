package com.bobsystem.behavioral.responsibility;

public abstract class AChain {

    protected AChain chain;

    protected AChain(AChain chain) {
        this.chain = chain;
    }

    public abstract void process(int data);
}
