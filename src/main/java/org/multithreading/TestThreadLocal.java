package org.multithreading;

/**
 * @author 滕广银
 * @description ThreadLocal 不支持继承
 * @date 2024/3/27 20:32
 */
public class TestThreadLocal {
    // static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();
    public static void main(String[] args) {
        threadLocal.set("hello world");

        Thread thread = new Thread(() -> System.out.println("thread:" + threadLocal.get()));
        thread.start();
        System.out.println("main:" + threadLocal.get());
    }
}
