package com.bobsystem.structural.flyweight;

import java.util.Map;
import java.util.WeakHashMap;

public class IPhoneChips {

    private static final Map<String, IPhoneChips> modelPool = new WeakHashMap<String, IPhoneChips>();

    private final String manufacturer;
    private final int hertz;

    private IPhoneChips(String manufacturer, int hertz) {

        this.manufacturer = manufacturer;
        this.hertz = hertz;
    }

    public static IPhoneChips get(String manufacturer, int hertz) {

        String key = manufacturer + hertz;

        IPhoneChips worker = IPhoneChips.modelPool.get(key);
        if (worker == null) {

            worker = new IPhoneChips(manufacturer, hertz);
            IPhoneChips.modelPool.put(key, worker);
        }

        return worker;
    }
}
