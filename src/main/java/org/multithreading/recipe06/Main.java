package org.multithreading.recipe06;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @author 滕广银
 * @description Main class of the example. Creates three WriterTask and a CleanerTask
 * @date 2023/8/1 10:02
 */
public class Main {

    public static void main(String[] args) {
        Deque<Event> deque = new ConcurrentLinkedDeque<>();

        WriterTask writerTask = new WriterTask(deque);

        for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
            Thread thread = new Thread(writerTask);
            thread.start();
        }

        CleanerTask cleanerTask = new CleanerTask(deque);
        cleanerTask.start();

    }
}
