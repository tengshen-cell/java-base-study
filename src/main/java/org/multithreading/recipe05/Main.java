package org.multithreading.recipe05;

import java.util.Date;

/**
 * @author 滕广银
 * @description Main method of the class. Create and star two initialization tasks
 * and wait for their finish
 * @date 2023/8/1 8:12
 */
public class Main {

    public static void main(String[] args) {
        DataSourcesLoader dataSourcesLoader = new DataSourcesLoader();

        Thread thread1 = new Thread(dataSourcesLoader, "DataSourcesLoader");

        NetworkConnectionsLoader networkConnectionsLoader = new NetworkConnectionsLoader();

        Thread thread2 = new Thread(networkConnectionsLoader, "NetworkConnectionsLoader");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: Configuration has been loaded: %s\n", new Date());
    }
}
