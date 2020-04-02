package com.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //循环读取文件数据
        FileInputStream f = new FileInputStream("D:\\Github\\java_project\\2020技术知识储备.txt");
        byte[] bytes = new byte[1024];
        while (true)
        {
            int temp = f.read(bytes);
            if (temp==-1) break;
            System.out.print(new String(bytes, 0, temp));
        }
        f.close();

    }
}
