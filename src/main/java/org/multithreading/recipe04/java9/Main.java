package org.multithreading.recipe04.java9;

import org.multithreading.recipe04.java7.ConsoleClock;

import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/7/31 23:24
 */
public class Main {

    public static void main(String[] args) {
        ConsoleClock clock = new ConsoleClock();
        Thread thread = new Thread(clock);

        thread.start();

        try {
            TimeUnit.SECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
