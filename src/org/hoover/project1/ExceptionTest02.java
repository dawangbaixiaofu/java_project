package org.hoover.project1;
import java.io.*;
public class ExceptionTest02 {
    public static void main(String[] args) {

        try {
            FileInputStream f = new FileInputStream("c:/tet/");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
