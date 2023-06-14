package org.effectivejava.chapter2.item3.field;

/**
 * @author 滕广银
 * @description Singleton with public final field
 * @date 2023/6/13 22:05
 */
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    // outta 离开
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here! ");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
