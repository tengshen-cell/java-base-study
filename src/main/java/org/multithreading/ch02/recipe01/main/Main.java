package org.multithreading.ch02.recipe01.main;

import org.multithreading.ch02.recipe01.parking.ParkingCash;
import org.multithreading.ch02.recipe01.parking.ParkingStats;
import org.multithreading.ch02.recipe01.parking.Sensor;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/8/4 22:10
 */
public class Main {
    public static void main(String[] args) {
        ParkingCash cash = new ParkingCash();
        ParkingStats stats = new ParkingStats(cash);

        System.out.print("Parking Simulator\n");

        int numberSensors = 2 * Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[numberSensors];

        for (int i = 0; i < numberSensors; i++) {
            Sensor sensor = new Sensor(stats);
            Thread thread = new Thread(sensor);

            thread.start();
            threads[i] = thread;

        }

        for (int i = 0; i < numberSensors; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Number of cars: %d\n", stats.getNumberCars());
        System.out.printf("Number of motorcycles: %d\n", stats.getNumberMotorcycles());
        cash.close();

    }
}
