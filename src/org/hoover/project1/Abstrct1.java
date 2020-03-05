package org.hoover.project1;

public abstract class Abstrct1 {
    Abstrct1(){
        System.out.println("abstrct1...");
    }
    public abstract int method1();
    public static void main(String[] args)
    {
        Abstrct1 a = new Abstrac2();
        System.out.println("the abstract method run result is: "+ a.method1());
    }
}
class Abstrac2 extends Abstrct1{
    Abstrac2(){
        super();
        System.out.println("abstract2....");
    }

    @Override
    public int method1() {
        return 0;
    }
}
