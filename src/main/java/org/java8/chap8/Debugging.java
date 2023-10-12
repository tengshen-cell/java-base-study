package org.java8.chap8;

import java.util.Arrays;
import java.util.List;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/10 11:09
 */
public class Debugging {

    private static class Point {
        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }

    public static void main(String[] args) {
        List<Point> points = Arrays.asList(new Point(12, 2), null);
        points.stream().map(p -> p.getX()).forEach(System.out::println);
    }
}
