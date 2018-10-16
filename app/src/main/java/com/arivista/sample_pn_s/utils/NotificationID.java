package com.arivista.sample_pn_s.utils;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Suresh seeni 15/10/2018.
 */
public class NotificationID {
    private final static AtomicInteger c = new AtomicInteger(0);
    public static int getID() {
        return c.incrementAndGet();
    }
}
