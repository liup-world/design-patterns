package com.bobsystem.behavioral.responsibility;

public abstract class AChain {

    protected AChain chain;

    public void setChain(AChain chain) {
        this.chain = chain;
    }

    public abstract void process(int data);
}
