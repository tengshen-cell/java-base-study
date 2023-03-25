package org.java8.chap4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/25 15:51
 */
public class StreamVsCollection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java8", "Lambdas", "In","Action");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
    }
}
