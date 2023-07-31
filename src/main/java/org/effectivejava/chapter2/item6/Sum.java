package org.effectivejava.chapter2.item6;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/6/28 21:13
 */
public class Sum {
    private static long sum() {
        Long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int numSets = Integer.parseInt(args[0]);
        long x = 0;


    }
}
