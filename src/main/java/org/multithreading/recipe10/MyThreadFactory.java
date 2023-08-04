package org.multithreading.recipe10;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * @author 滕广银
 * @description Class
 * @date 2023/8/3 22:06
 */
public class MyThreadFactory implements ThreadFactory {

    // Attributes to save necessary data to the factory
    private int counter;
    private String name;
    private List<String> stats;

    public MyThreadFactory(String name) {
        counter = 0;
        this.name = name;
        stats = new ArrayList<String>();
    }

    @Override
    public Thread newThread(Runnable r) {
        // Create the Thread object
        Thread t = new Thread(r, name + "-Thread_" + counter);
        counter++;
        stats.add(String.format("Created thread %d with name %s on %s\n", t.getId(), t.getName(), new Date()));
        return t;
    }

    public String getStats() {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iterator = stats.iterator();

        while (iterator.hasNext()) {
            buffer.append(iterator.next());
        }
        return buffer.toString();
    }
}
