package com.bobsystem.behavioral.mediator;

public class PlayerMediator
    extends APlayerMediator {

    /**
     * 发生耦合的地方，将耦合集中到这里
     */
    @Override
    public void next(AHardware hardware) {
        if (hardware == super.memory) {
            super.cpu.process(hardware);
            return;
        }
        if (hardware == super.cpu) {
            super.displayCard.process(hardware);
            super.soundCard.process(hardware);
        }
    }
}
