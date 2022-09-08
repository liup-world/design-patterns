package com.bobsystem.behavioral.mediator;

public class DisplayCard
    extends AHardware {

    @Override
    public void process(AHardware prevHardware) {
        CPU cpu = (CPU) prevHardware;
        System.out.println("显卡 播放CPU解析的 视频数据。" + cpu);
    }
}
