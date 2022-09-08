package com.bobsystem.behavioral.mediator;

public class Memory
    extends AHardware {

    @Override
    public void process(AHardware prevHardware) {
        System.out.println("内存 从硬盘加载电影数据完毕。");
        super.process(prevHardware);
    }
}
