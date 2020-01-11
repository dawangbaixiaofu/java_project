//interface 
//Java里的接口, 就是抽象方法和常量值的集合.
//接口里所有成员都是公共静态常变量成员
//接口里不能定义构造方法
//类可以实现接口 implements 


/*Java关键字this只能用于方法方法体内。当一个对象创建后，
Java虚拟机（JVM）就会给这个对象分配一个引用自身的指针，这个指针的名字就是this。
this只能在类中的非静态方法中使用，静态方法和静态的代码块中绝对不能出现this

表示用类的成员变量，而非函数参数;
this不能用在static方法中

*/






/*

interface 接口定义
public interface interface_name [extends <Superinterface_list>]
{
public static int i = 1;
public abstract methods;
int i = 10; //就相当于  public static final int i =10;
//接口里所有方法都是公共抽象方法;接口里的方法都有个修饰词组合: public abstract

}


public class it_class implements interface_name
{
	int j = this.i;
}



*/


