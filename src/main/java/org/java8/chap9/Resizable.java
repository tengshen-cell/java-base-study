package org.java8.chap9;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/10/9 14:24
 */
public interface Resizable extends Drawable {
    int getWidth();
    int getHeight();

    void setWidth(int width);
    void setHeight(int height);

    void setAbsoluteSize(int width, int height);
}
