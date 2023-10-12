package org.java8.chap9;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/10 10:40
 */
public class MostSpecific {
    interface A{
        public default void hello() {
            System.out.println("Hello from A");
        }
    }

    interface B extends A {
        public default void hello() {
            System.out.println("Hello from B");
        }
    }

    static class C implements B, A{}
    static class D implements A{}
    static class E extends D implements B, A{}

    static class F implements B, A {
        public void hello() {
            System.out.println("Hello from F");
        }
    }

    static class G extends F implements B, A{}

    public static void main(String[] args) {
        new C().hello();
        new E().hello();
        new G().hello();
    }
}
