package org.java8.chap9;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/9 13:55
 */
public class Diamond {

    static interface A {
        default void hello() {
            System.out.println("Hello from A");
        }
    }

    static interface B extends A {

    }

    static interface C extends A {

    }

    static class D implements B, C {

    }

    public static void main(String[] args) {
        new D().hello();
    }
}
