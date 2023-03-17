package org.multithreading.recipe02;

/**
 * @author 滕广银
 * @description This class generates prime numbers until is interrupted
 * @date 2023/3/17 14:38
 */
public class PrimeGenerator extends Thread{
    Long number = 1L;

    @Override
    public void run() {
        while (true) {
            if (isPrime(number)) {
                System.out.printf("Number is Prime\n", number);
            }

            if (isInterrupted()) {
                System.out.printf("The Prime Generator has been Interrupted\n");
                return;
            }
            number++;
        }
    }

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
