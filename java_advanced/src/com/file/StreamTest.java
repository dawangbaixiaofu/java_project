package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamTest {
    public static void main(String[] args) throws IOException {
        /**
         * 流的类和常用的方法
         * 输入流（读read）input把数据输入到程序中[到内存中去]
         * 输出流（写write）output把数据从程序中输出[从内存中出来]
         * 按照传输的内容分:
         * 字节流
         *  字节输入流：InputStream是根父类
         *  字节输出流  OutputStream超类
         *      常用方法：
         *      close()
         *      flush()
         *      write()
         *      构造方法：
         *
         *      子类
         *      ByteArrayOutputStream
         *      FileOutputStream
         *          构造方法：
         *          FileOutputStream(File file)
         *          FileOutputStream(String name)
         *      FilterOutputStream
         *      ObjectOutputStream
         *      OutputStream
         *      PipedOutputStream
         * 字符流
         *  字符输入流 Reader是根父类（超类）
         *  字符输出流   Writer(超类）
         *
         *  字符流是以reader或者writer结尾
         *  字节流是以Stream结尾
         *String类
         * 把字符转换为字节
         * byte[] getBetys()
         */
        File f = new File("test.txt");
        FileOutputStream pipe = new FileOutputStream(f);

        String data = "hello IP";
        byte[] b = data.getBytes();
        System.out.println(Arrays.toString(b));
        pipe.write(b);
        pipe.close();
        f.delete();



    }
}
