package org.java8.chap6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/5/25 20:44
 */
public class PartitionPrimeNumbers {
    public static void main(String[] args) {

    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(Collectors.partitioningBy(candidate -> isPrime(candidate)));
    }

    public static boolean isPrime(int candidate) {
        return IntStream.rangeClosed(2, candidate - 1)
                .limit((long) Math.floor(Math.sqrt(candidate)) - 1)
                .noneMatch(i -> candidate % i == 0);
    }
}
