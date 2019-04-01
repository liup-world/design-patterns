package com.bobsystem.behavioral.mediator;

public class CPU
    extends AHardware {

    public CPU(APlayMovieMediator mediator) {
        super(mediator);
    }

    @Override
    public void process(AHardware colleague) {

        Memory memory = (Memory)colleague;

        System.out.println("CPU 解析内存中的数据。" + memory);

        super.process(colleague);
    }
}
