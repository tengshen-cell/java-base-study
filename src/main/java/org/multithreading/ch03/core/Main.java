package org.multithreading.ch03.core;

import org.multithreading.ch03.task.Job;
import org.multithreading.ch03.task.PrintQueue;

/**
 * @author 滕广银
 * @description Main method of the class. Run ten 
 * @date 2023/8/9 21:34
 */
public class Main {

    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();

        Thread[] threads = new Thread[12];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Job(printQueue), "Thread " + i);
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
