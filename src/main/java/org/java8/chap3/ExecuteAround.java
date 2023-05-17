package org.java8.chap3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/5/17 22:33
 */
public class ExecuteAround {
    public static void main(String[] args) {

    }

    public static String processFileLimited() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lambdasinaction/chap3/data.txt"));
        return br.readLine();
    }
}
