package org.java8.ch5;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/28 8:10
 */
public class BuildingStreams {
    public static void main(String[] args) {
        // Stream.of
        Stream<String> stream = Stream.of("Java 8", "Lambdas", "In", "Action");
        stream.map(String::toUpperCase).forEach(System.out::println);

        // Steam.empty()
        Stream<String> emptyStream = Stream.empty();

        int[] numbers = {2, 3, 5, 11, 13};
        System.out.println(Arrays.stream(numbers).sum());

        Stream.iterate()
    }
}
