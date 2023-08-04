package org.multithreading.recipe07;

/**
 * @author 滕广银
 * @description Class that process the uncaught
 * @date 2023/8/1 11:48
 */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("An exception has been captured\n");

    }
}
