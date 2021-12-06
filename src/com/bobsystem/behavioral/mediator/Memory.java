package com.bobsystem.behavioral.mediator;

public class Memory
    extends AHardware {

    public Memory(APlayerMediator mediator) {
        super(mediator);
    }

    @Override
    public void process(AHardware hardware) {
        System.out.println("从硬盘加载电影数据完毕。");
        super.process(hardware);
    }
}
