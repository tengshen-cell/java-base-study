package org.multithreading.recipe03;

import java.util.concurrent.TimeUnit;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/7/31 22:56
 */
public class Main {

    public static void main(String[] args) {
        FileSearch searcher = new FileSearch("D:\\", "autoexec.txt");

        Thread thread = new Thread(searcher);

        thread.start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
