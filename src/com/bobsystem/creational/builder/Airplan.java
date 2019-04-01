package com.bobsystem.creational.builder;

import com.bobsystem.creational.builder.interfaces.IAirplanBuilder;

public class Airplan {

    private String wing;
    private String engine;
    private String enclosure;
    private String wheel;

    // privatization constructor
    private Airplan() {
    }

    /**
     * 建造者模式
     * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
     * 理解：如果一个 [复杂] 或者是 [构造时间长] 的对象，而又可能只用到它的部分成员，
     *      这种场景可以使用建造者模式 分步构造
     */
    public static class Builder
        implements IAirplanBuilder {

        private Airplan airplan;

        public Builder() {
            System.out.println("大飞机需要世界顶尖的技术，所以在很多国家的顶尖公司都参与制造。");
        }

        @Override
        public Airplan build() {

            this.airplan = new Airplan();

            IAirplanBuilder builder = new AirplanEnclosuerBuilder(this.airplan);
            builder.build();
            System.out.println(airplan);
            delay();

            builder = new AirplanEngineBuilder(this.airplan);
            builder.build();
            System.out.println(airplan);
            delay();

            builder = new AirplanWheelBuilder(this.airplan);
            builder.build();
            System.out.println(airplan);
            delay();

            builder = new AirplanWingBuilder(this.airplan);
            builder.build();
            System.out.println(airplan);

            return this.airplan;
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

    @Override
    public String toString() {
        return "Airplan{" +
            "wing='" + wing + '\'' +
            ", engine='" + engine + '\'' +
            ", enclosure='" + enclosure + '\'' +
            ", wheel='" + wheel + '\'' +
            '}';
    }

    //region getter setter

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    //endregion
}
