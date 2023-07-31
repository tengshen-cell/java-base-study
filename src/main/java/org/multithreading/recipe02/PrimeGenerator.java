package org.multithreading.recipe02;

/**
 * @author 滕广银
 * @description This class generates prime numbers until is interrupted
 * @date 2023/7/31 21:59
 */
public class PrimeGenerator extends Thread {

    public void run() {
        long number = 1L;

        while (true) {
            if (isPrime(number)) {
                System.out.printf("Number %d is Prime\n", number);
            }

            if (isInterrupted()) {
                System.out.print("The Prime Generator has been Interrupted\n");
                return;
            }
            number++;
        }
    }

    /**
     * Method that calculate if a number is prime or not
     *
     * @author: Guangyin Teng
     * @date: 2023/7/31 22:04
     * @param: [number]
     * @return: boolean
     */
    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }
        for (long i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
