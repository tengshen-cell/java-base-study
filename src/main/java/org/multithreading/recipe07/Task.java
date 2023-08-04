package org.multithreading.recipe07;

/**
 * @author 滕广银
 * @description Runnable classed than throws and Exception
 * @date 2023/8/1 10:21
 */
public class Task implements Runnable {
    @Override
    public void run() {
        int number = Integer.parseInt("TTT");
        System.out.printf("Number: %d ", number);
    }
}
