package com.file;
import java.io.File;
public class SomeImportMethod {
    public static void main(String[] args) {
        //File 中的一些重要功能
        /**
         * String[] list() 返回路径下的所有文件
         * File[] listFiles()
         * listRoots() 返回根路径列表数组
         *
         * 对文件夹的文件进行条件过滤
         * String.endWith(".java")
         */
        //输出com文件夹下所有的.java文件,递归输出
        SomeImportMethod file = new SomeImportMethod();
        File f = new File("D:\\Github\\java_project\\java_advanced\\src\\com");
        file.method(f);

    }
    public void method(File file)
    {
        if(file.isDirectory())
        {
            for (File f : file.listFiles())
            {
                if (f.isFile())
                {
                    if (f.getName().endsWith(".java"))
                    {
                        System.out.println(f.getName());
                    }

                }
                else
                {
                    method(f);
                }

            }

        }

    }

}
