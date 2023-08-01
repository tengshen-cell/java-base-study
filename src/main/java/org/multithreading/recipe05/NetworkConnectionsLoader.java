package org.multithreading.recipe05;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/8/1 8:03
 */
public class NetworkConnectionsLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Beginning network connections loading: %s\n", new Date());

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Network connections loading has finished: %s\n", new Date());
    }
}
