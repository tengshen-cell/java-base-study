package org.multithreading;


/**
 * @author 滕广银
 * @description ThreadLocal 测试
 * @date 2024/3/27 18:25
 */
public class ThreadLocalTest {

    static ThreadLocal<String> localVariable = new ThreadLocal<>();


    static void print(String str) {
        System.out.println(str + ":" + localVariable.get());

        localVariable.remove();
    }

    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            localVariable.set("threadOne local variable");
            print("threadOne");
            System.out.println("threadOne remove after" + ":" + localVariable.get());
        });

        Thread threadTwo = new Thread(() -> {
            localVariable.set("threadTwo local variable");
            print("threadTwo");
            System.out.println("threadTwo remove after" + ":" + localVariable.get());
        });

        threadOne.start();
        threadTwo.start();
    }
}
