package org.java8.chap9;

import java.util.List;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/9 14:01
 */
public class Utils {
    public static void paint(List<Resizable> l) {
        l.forEach(r -> { r.setAbsoluteSize(42, 42);});
    }
}
