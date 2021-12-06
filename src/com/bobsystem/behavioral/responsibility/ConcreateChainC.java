package com.bobsystem.behavioral.responsibility;

public class ConcreateChainC
    extends AChain {

    public ConcreateChainC() {
        super(null);
    }

    @Override
    public void process(int data) {
        if (data >= 20 && data < 30) {
            System.out.println("C success. data = " + data);
            return;
        }
        System.out.println("处理不了，但所有实现都尝试了一遍。data = " + data);
    }
}
