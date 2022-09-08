package com.bobsystem.behavioral.mediator;

public class SoundCard
    extends AHardware {

    @Override
    public void process(AHardware prevHardware) {
        System.out.println("声卡 播放CPU解析的 音频数据。" + prevHardware);
    }
}
