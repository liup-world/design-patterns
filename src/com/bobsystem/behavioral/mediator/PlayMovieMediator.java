package com.bobsystem.behavioral.mediator;

public class PlayMovieMediator
    extends APlayMovieMediator {

    /**
     * 发生耦合的地方，将耦合集中到这里
     */
    @Override
    public void next(AHardware colleague) {

        if (colleague == super.memory) {

            super.cpu.process(colleague);
            return;
        }
        if (colleague == super.cpu) {

            super.displayCard.process(colleague);
            super.soundCard.process(colleague);
        }
    }
}
