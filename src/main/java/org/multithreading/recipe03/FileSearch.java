package org.multithreading.recipe03;

import java.io.File;

/**
 * @author 滕广银
 * @description This class search for files with a name in a directory
 * @date 2023/7/31 22:31
 */
public class FileSearch implements Runnable{

    private String initPath;

    private String fileName;

    public FileSearch(String initPath, String fileName) {
        this.initPath = initPath;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        File file = new File(initPath);
        if (file.isDirectory()) {
            try {
                directoryProcess(file);
            } catch (InterruptedException e) {
                System.out.printf("%s: The search has been interrupted", Thread.currentThread().getName());
                cleanResources();
            }
        }
    }

    private void cleanResources() {

    }

    private void directoryProcess(File file) throws InterruptedException {
        File[] files = file.listFiles();
        if (files != null) {
            for (File value : files) {
                if (value.isDirectory()) {
                    directoryProcess(value);
                } else {
                    fileProcess(value);
                }
            }
        }
    }

    private void fileProcess(File file) throws InterruptedException {
        if (file.getName().equals(fileName)) {
            System.out.printf("%s : %s\n", Thread.currentThread().getName(), file.getAbsolutePath());
        }

        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }
}
