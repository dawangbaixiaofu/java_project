package com.huwei;
import java.io.File;
public class path {
    public static void main(String[] args) {
        //判断当前路径
        File directory = new File(".");
        System.out.println(directory.getAbsoluteFile());
    }
}
