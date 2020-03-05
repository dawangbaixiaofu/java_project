package org.hoover.project1;

public class ExceptionTest03 {
    public static int i = 10;

    public static void main(String[] args)
    {
        int j = m1();
        System.out.println("main method: "+j);

    }
    public static int m1()
    {

        try{
            return i;
        }
        finally {
            i++;
            System.out.println("m1 method: "+i);
        }

    }
}
