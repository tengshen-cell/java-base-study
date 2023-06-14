package org.java8.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/5/23 20:55
 */
public class Laziness {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> twoEvenSquares = number.stream()
                .filter(n -> {
                    System.out.println("filtering " + n);
                    return n % 2 == 0;
                })
                .map(n -> {
                    System.out.println("mapping " + n);
                    return n * n;
                })
                .limit(2)
                .collect(Collectors.toList());
    }
}
