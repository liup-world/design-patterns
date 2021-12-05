package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class Airplan
    extends AirplanComponent {

    private WingComponent wing;
    private EngineComponent engine;
    private EnclosureComponent enclosure;
    private WheelComponent wheel;

    // privatization constructor
    private Airplan() { }

    @Override
    public String toString() {
        return "Airplan{" +
            "wing='" + wing + '\'' +
            ", engine='" + engine + '\'' +
            ", enclosure='" + enclosure + '\'' +
            ", wheel='" + wheel + '\'' +
            '}';
    }

    //region setter
    public WingComponent getWing() {
        return wing;
    }

    public EngineComponent getEngine() {
        return engine;
    }

    public EnclosureComponent getEnclosure() {
        return enclosure;
    }

    public WheelComponent getWheel() {
        return wheel;
    }
    //endregion

    //region inner class
    /**
     * 建造者模式
     *   将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
     * 理解：如果一个 [复杂] 或者是 [构造时间长] 的对象，而又可能只用到它的部分成员，
     *      这种场景可以使用建造者模式 分步构造
     */
    public static class Builder
        implements IAirplanBuilder {

        public Builder() {
            System.out.println("大飞机需要世界顶尖的技术，所以在很多国家的顶尖公司都参与制造。\r\n");
        }

        @Override
        public Airplan build() {
            Airplan airplan = new Airplan();

            IAirplanBuilder builder = new EnclosureComponent.Builder();
            airplan.enclosure = (EnclosureComponent) builder.build();
            System.out.println(airplan);
            delay();

            builder = new EngineComponent.Builder();
            airplan.engine = (EngineComponent) builder.build();
            System.out.println(airplan);
            delay();

            builder = new WheelComponent.Builder();
            airplan.wheel = (WheelComponent) builder.build();
            System.out.println(airplan);
            delay();

            builder = new WingComponent.Builder();
            airplan.wing = (WingComponent) builder.build();
            System.out.println(airplan);

            return airplan;
        }

        // 通过延时 模拟创建过程耗时
        private void delay() {
            try {
                Thread.sleep(500);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    //endregionregion inner class
}
