package org.java8.chap9;

import java.util.function.Function;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/10 9:29
 */
public class Letter {
    public static String addHeader(String text) {
        return "From Raoul, Mario and Alan:" + text;
    }

    public static String addFooter(String text) {
        return text + "King regards";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("C\\+\\+", "**Censored**");
    }

    public static void main(String[] args) {
        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> stringStringFunction = addHeader.andThen(Letter::checkSpelling)
                .andThen(Letter::addFooter);

        System.out.println(stringStringFunction.apply("C++ stay away from me!"));
    }
}
