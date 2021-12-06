package com.bobsystem.behavioral.mediator;

/**
 * 这个例子有一个 播放电影的中介对象，还有 内存、CPU、声卡、显卡
 * 每个具体的硬件内部都引用中介，在执行完该硬件执行的过程后，将控制权交给中介，
 * 由中介将该过程处理的结果交给下一过程
 */
public abstract class APlayerMediator {

    protected Memory memory;
    protected CPU cpu;
    protected DisplayCard displayCard;
    protected SoundCard soundCard;

    /**
     * 发生耦合的地方，将耦合集中到这里
     */
    public abstract void next(AHardware hardware);

    public void play() {
        this.memory.process(null);
    }

    //region getter setter
    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setDisplayCard(DisplayCard displayCard) {
        this.displayCard = displayCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
    //endregion
}
