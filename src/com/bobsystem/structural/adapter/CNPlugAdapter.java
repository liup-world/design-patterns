package com.bobsystem.structural.adapter;

import com.bobsystem.structural.adapter.interfaces.IPlug;

/**
 * 适配器模式(adapter)：
 *   适配器模式把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 *
 * 理解：
 *   在调用一个不太符合预期的对象时，抽出一个 Adapter 类，在这个类对象中进行针对性的加工适配。
 */
public class CNPlugAdapter
    implements IPlug {

    private final HKPlug hkPlug;

    public CNPlugAdapter(HKPlug hkPlug) {

        this.hkPlug = hkPlug;
    }

    @Override
    public void smallPin() {

        System.out.println("大陆的插板是 小针的，在这里 将香港 大针插头 转换为小针的");

        if (this.hkPlug != null) {
            this.hkPlug.bigPin();
        }
    }
}
