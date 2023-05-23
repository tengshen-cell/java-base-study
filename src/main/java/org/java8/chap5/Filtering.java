package org.java8.chap5;

import org.java8.chap4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/5/22 22:44
 */
public class Filtering {
    public static void main(String[] args) {
        List<Dish> collect = Dish.menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        List<Dish> dishesLimits = Dish.menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());
        dishesLimits.forEach(System.out::println);

        List<Dish> dishesSkip2 = Dish.menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());
        dishesSkip2.forEach(System.out::println);
    }
}
