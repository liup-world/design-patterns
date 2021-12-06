package com.bobsystem.behavioral.mediator;

public abstract class AHardware {

    protected final APlayerMediator mediator;

    public AHardware(APlayerMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 将当前对象传给中介，使下一过程可以使用当前的处理结果
     */
    public void process(AHardware hardware) {
        if (this.mediator != null) {
            this.mediator.next(this);
        }
    }
}
