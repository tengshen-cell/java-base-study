package org.effectivejava.chapter2.item3.enumtype;

/**
 * @author 滕广银
 * @description Enum singleton - the preferred approach
 * @date 2023/6/13 21:35
 */
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
