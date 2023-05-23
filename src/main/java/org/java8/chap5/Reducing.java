package org.java8.chap5;

import org.java8.chap4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/5/18 23:13
 */
public class Reducing {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3, 4, 5, 1, 2);
        int sum = number.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int sum2 = number.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        int max = number.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);

        Optional<Integer> min = number.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        Integer calories = Dish.menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);

        System.out.println("Number of calories:" + calories);
    }
}
