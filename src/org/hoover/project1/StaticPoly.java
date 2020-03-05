package org.hoover.project1;

public class StaticPoly{
    public static void main(String[] args){
        StaticSuper sup = new StaticSub();
        //域和静态方法不能多态
        System.out.println(sup.field);
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());

    }
}
class StaticSuper {
    public int field = 0;
    public static String staticGet(){
        return("Base staticGet()");
    }
    public static String dynamicGet(){
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper{
    public int field = 1;
    public static String staticGet(){
        return "Derived staticGet()";
    }
    public static String dynamicGet(){
        return "Derived dynamicGet()";
    }
}

