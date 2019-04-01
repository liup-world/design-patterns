package com.bobsystem.behavioral.mediator;

public class DisplayCard
    extends AHardware {

    public DisplayCard(APlayMovieMediator mediator) {
        super(mediator);
    }

    @Override
    public void process(AHardware colleague) {

        CPU cpu = (CPU)colleague;

        System.out.println("显卡 播放CPU解析的 视频数据。" + cpu);
    }
}
