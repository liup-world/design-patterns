package com.bobsystem.behavioral.mediator;

public class Memory
    extends AHardware {

    public Memory(APlayMovieMediator mediator) {
        super(mediator);
    }

    @Override
    public void process(AHardware colleague) {

        System.out.println("从硬盘加载电影数据完毕。");

        super.process(colleague);
    }
}
