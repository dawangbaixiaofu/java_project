//this  静态方法和非静态方法

//静态方法和非静态方法的区别
/*
1.静态方法属于类所有，类实例化前即可使用；
2.非静态方法可以访问类中的任何成员，静态方法只能访问类中的静态成员；
3.静态方法在类实例化前就可以使用，而类中的非静态变量必须在实例化之后才能分配内存；
4.static内部只能出现static变量和其他static方法!
	而且static方法中还不能使用this等关键字

最主要的区别：静态方法在创建对象前就可以使用了，非静态方法必须通过new出来的对象调用。
	也就是说非静态方法要被实例化才能被静态方法调用。
*/


public class ThisTest
{
	private int i = 10;
	public static void main(String[] args)
	{
		ThisTest test = new ThisTest();
		test.this_test();
	}

	public void this_test()
	{
		int i = 1;
		int a = this.i;
		System.out.println("输出this.i的值："+a);
	}
}