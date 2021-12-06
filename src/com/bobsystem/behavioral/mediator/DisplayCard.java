package com.bobsystem.behavioral.mediator;

public class DisplayCard
    extends AHardware {

    public DisplayCard(APlayerMediator mediator) {
        super(mediator);
    }

    @Override
    public void process(AHardware hardware) {
        CPU cpu = (CPU) hardware;
        System.out.println("显卡 播放CPU解析的 视频数据。" + cpu);
    }
}
