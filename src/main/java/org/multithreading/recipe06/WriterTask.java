package org.multithreading.recipe06;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description Runnable class that generates and event every second
 * @date 2023/8/1 9:43
 */
public class WriterTask implements Runnable {

    Deque<Event> deque;

    public WriterTask(Deque<Event> deque) {
        this.deque = deque;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {

            // Creates and initializes the Event objects
            Event event = new Event();
            event.setDate(new Date());
            event.setEvent(String.format("The thread %s has generated the event %d event", Thread.currentThread().getId(), i));
            deque.addFirst(event);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
