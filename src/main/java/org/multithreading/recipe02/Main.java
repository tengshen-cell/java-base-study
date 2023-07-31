package org.multithreading.recipe02;

import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/7/31 22:11
 */
public class Main {
    public static void main(String[] args) {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        primeGenerator.start();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Interrupt the prime number generator
        primeGenerator.interrupt();

        System.out.printf("Main: Status of the Thread : %s\n", primeGenerator.getState());
        System.out.printf("Main: isInterrupted: %s\n", primeGenerator.isInterrupted());
        System.out.printf("Main: isAlive: %s\n", primeGenerator.isAlive());
    }
}
