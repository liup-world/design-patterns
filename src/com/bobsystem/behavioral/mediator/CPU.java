package com.bobsystem.behavioral.mediator;

public class CPU
    extends AHardware {

    public CPU(APlayerMediator mediator) {
        super(mediator);
    }

    @Override
    public void process(AHardware hardware) {
        Memory memory = (Memory) hardware;
        System.out.println("CPU 解析内存中的数据。" + memory);
        super.process(hardware);
    }
}
