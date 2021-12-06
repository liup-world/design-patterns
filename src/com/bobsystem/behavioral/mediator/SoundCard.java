package com.bobsystem.behavioral.mediator;

public class SoundCard
    extends AHardware {

    public SoundCard(APlayerMediator mediator) {
        super(mediator);
    }

    @Override
    public void process(AHardware hardware) {
        System.out.println("声卡 播放CPU解析的 音频数据。" + hardware);
    }
}
