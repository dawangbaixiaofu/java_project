package org.hoover.project1;

public class CarTest {
    public static void main(String[] args){
        Engine e = new Mazida();
        Engine a = new Honji();
        Honji a1 = (Honji) a; //强制类型转换
        a1.logout();


        Car c = new Car(e);
        System.out.println(c); //默认调用c对象的toString方法
        System.out.println(c.toString());
        c.testEngine();

        c.e = a;
        c.testEngine();

        String s1 = new String("aaa");
        String s2 = new String("aaa");

        System.out.println(s1== s2);
        System.out.println("aaa"=="aaa");
        System.out.println(s1.equals(s2)); //String 类已经重写了Object中的equals方法，比较的是字符串的内容


    }
}
