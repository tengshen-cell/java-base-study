package org.multithreading.recipe06;

import java.util.Date;
import java.util.Deque;

/**
 * @author 滕广银
 * @description
 * @date 2023/8/1 8:39
 */
public class CleanerTask extends Thread {

    private Deque<Event> deque;

    public CleanerTask(Deque<Event> deque) {
        this.deque = deque;
        // Establish that this is a Daemon Thread
        setDaemon(true);
    }


    private void clean(Date date) {
        long difference;
        boolean delete;

        if (deque.size() == 0) {
            return;
        }

        delete = false;
        do {
            Event e = deque.getLast();
            difference = date.getTime() - e.getDate().getTime();
            if (difference > 10000) {
                System.out.printf("Cleaner: %s\n", e.getEvent());
                deque.removeLast();
                delete = true;
            }
        } while (difference > 10000);
        if (delete) {
            System.out.printf("Cleaner: Size of the queue: %d\n", deque.size());
        }
    }
}
