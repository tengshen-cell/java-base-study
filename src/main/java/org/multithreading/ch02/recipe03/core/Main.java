package org.multithreading.ch02.recipe03.core;

import org.multithreading.ch02.recipe03.task.Job;
import org.multithreading.ch02.recipe03.task.PrintQueue;

import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/8/7 22:16
 */
public class Main {

    public static void main(String[] args) {
        System.out.printf("Running example with fair-mode = false\n");
        testPrintQueue(false);
        System.out.printf("Running example with fair-mode = true\n");
        testPrintQueue(true);
    }

    private static void testPrintQueue(boolean fairMode) {

        // Creates the print queue
        PrintQueue printQueue = new PrintQueue(fairMode);

        Thread thread[] = new Thread[10];

        for (int i = 0; i < 10 ; i++) {
            thread[i] = new Thread(new Job(printQueue),"Thread " + i);
        }

        for (int i = 0; i < 10; i++) {
            thread[i].start();

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 10; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
