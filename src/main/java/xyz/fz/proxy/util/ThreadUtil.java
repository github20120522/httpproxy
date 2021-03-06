package xyz.fz.proxy.util;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ThreadUtil {

    private static final ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(
            5,
            new BasicThreadFactory.Builder().namingPattern("util-schedule-pool-%d").daemon(true).build()
    );

    public static ScheduledExecutorService executor() {
        return executorService;
    }
}
