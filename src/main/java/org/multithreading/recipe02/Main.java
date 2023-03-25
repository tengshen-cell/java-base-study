package org.multithreading.recipe02;

import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/17 15:07
 */
public class Main {
    public static void main(String[] args) {
        Thread task = new PrimeGenerator();
        task.start();

        // wait 5 seconds
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        task.interrupt();

        System.out.printf("");
        System.out.printf("");
        System.out.printf("");

    }
}
