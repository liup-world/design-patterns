package com.bobsystem.behavioral.mediator;

public class CPU
    extends AHardware {

    @Override
    public void process(AHardware prevHardware) {
        Memory memory = (Memory) prevHardware;
        System.out.println("CPU 解析内存中的数据。" + memory);
        super.process(prevHardware);
    }
}
