package org.multithreading.recipe05;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description Class that simulates an initialization operation.
 * It sleeps during four seconds
 * @date 2023/8/1 7:55
 */
public class DataSourcesLoader implements Runnable {
    @Override
    public void run() {
        // Writes a message
        System.out.printf("Beginning data sources loading: %s\n", new Date());

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Writes a message
        System.out.printf("Data sources loading has finished: %s\n", new Date());
    }
}
