package org.multithreading.ch02.recipe01.parking;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/8/4 21:25
 */
public class ParkingCash {

    private static final int cost = 2;

    private long cash;

    public ParkingCash() {
        cash = 0;
    }

    public void vehiclePay() {
        cash += cost;
    }

    public void close() {
        System.out.printf("Closing accounting");
        long totalAmount;
        totalAmount = cash;
        cash = 0;
        System.out.printf("The total amount is : %d", totalAmount);
    }
}
