package com.bobsystem.structural.facade;

/**
 * 外观模式(facade)：
 *   为子系统中的一组接口提供一个一致的界面，定义一个高层接口，这个接口使得这一子系统更加容易使用。

 * 理解：
 *   将一系列操作 封装到一个接口，通过调用这个接口，等于间接调用了这一系列操作
 */
public class Computer {

    private final Mainboard mainboard = new Mainboard();
    private final Memory memory = new Memory();
    private final CPU cpu = new CPU();

    public void start() {
        System.out.println("摁下开关，机器通电。");
        this.mainboard.boot();
        this.memory.load();
        this.cpu.process();
        System.out.println("电脑启动完成。");
    }
}
