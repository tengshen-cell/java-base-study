package org.java8.chap9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/9 17:27
 */
public class Intro {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 2, 6);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }
}
