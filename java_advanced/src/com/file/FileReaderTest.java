package com.file;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        //循环读取文件数据
        FileReader f = new FileReader("D:\\Github\\java_project\\2020技术知识储备.txt");
        char[] chars = new char[512];
        while (true)
        {
            int temp = f.read(chars);
            if (temp==-1) break;
            System.out.print(new String(chars, 0, temp));
        }
        f.close();

    }
}
