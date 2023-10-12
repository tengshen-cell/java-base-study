package org.java8.chap9;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/9 11:11
 */
public class Ambiguous {
    static interface A {
        default void hello() {
            System.out.println("Hello from A");
        }
    }

    static interface B {
        default void hello() {
            System.out.println("Hello from B");
        }
    }

    static class C implements B, A {
        public void hello() {
            A.super.hello();
        }
    }

    public static void main(String[] args) {
        new C().hello();
    }
}
