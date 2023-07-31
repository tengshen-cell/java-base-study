package org.multithreading.recipe04.java7;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description Class that writes the actual date to a file every second
 * @date 2023/7/31 23:19
 */
public class ConsoleClock implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s\n", new Date());

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.printf("The FileClock has been interrupted.\n");
            }
        }
    }
}
