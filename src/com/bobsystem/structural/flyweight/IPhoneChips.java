package com.bobsystem.structural.flyweight;

import java.util.Map;
import java.util.WeakHashMap;

public class IPhoneChips {

    // 如应用在多线程环境中应使用线程安全的 map
    private static final
        Map<String, IPhoneChips> CACHED_CHIPS = new WeakHashMap<String, IPhoneChips>();

    private final String manufacturer;
    private final int hertz;

    private IPhoneChips(String manufacturer, int hertz) {
        this.manufacturer = manufacturer;
        this.hertz = hertz;
    }

    public static IPhoneChips get(String manufacturer, int hertz) {
        String key = manufacturer + hertz;
        IPhoneChips worker = CACHED_CHIPS.get(key);
        if (worker == null) {
            worker = new IPhoneChips(manufacturer, hertz);
            CACHED_CHIPS.put(key, worker);
        }
        return worker;
    }
}
