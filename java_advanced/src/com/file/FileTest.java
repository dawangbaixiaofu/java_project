package com.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        //File构造方法
        /**
         * File(File parent,String child)
         * File(String pathname)
         * File(String parent,String child)
         * 创建一个指向该文件的File对象
         *常用方法和实现功能
         * 1.创建 boolean createNewFile() 创建文件
         *       boolean mkdir()
         *       boolean mkdirs()
         *
         * 2.删除 boolean delete()
         * 删除文件夹时候，下面不能有文件和子文件夹
         * 3.获取   File getAbsoluteFile()
         *         String getAbsolutePath()
         *         String getName() 获取文件名
         *         String getPath()
         *         File getParentFile()
         *         String getPath()
         *         long lastModified() 最后一次修改时间
         *         long length() 文件的字节数
         * 4.判断 boolean exists()
         *      boolean isAbsolute()
         *      boolean isDirectory()
         *      boolean isFile()
         *      boolean isHidden()
         * 5.修改方法
         *  boolean renameTo()
         *
         */
        File f = new File("example");
        File f1 = new File(f,"c.txt");
        if (!f.exists())
        {
            f.mkdir();
        }

        f1.createNewFile();


        //System.out.println(f.mkdir());
        //System.out.println(f.createNewFile());
        //System.out.println(f.delete());
        //System.out.println(f.isFile());
    }
}
