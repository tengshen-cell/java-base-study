package org.java8.chap14;

import java.util.function.Function;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/13 9:56
 */
public class Combinators {

    public static void main(String[] args) {

    }

    static <A, B , C> Function<A, C> compose(Function<B,C> g, Function<A, B> f) {
        return x -> g.apply(f.apply(x));
    }

}
