package org.effectivejava.chapter2.item3.staticfactory;

/**
 * @author 滕广银
 * @description Singleton with static factory
 * @date 2023/6/14 20:38
 */
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}
