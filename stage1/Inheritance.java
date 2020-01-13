//继承如何继承对构造函数的继承已经扩展
//对于带参数的构造函数，可以使用super()来使用父类的构造函数
public class Inheritance extends ProjectOne
{
	public boolean damage;
	Inheritance(String name,int price,boolean damage)
	{
		super(name,price);
		this.damage = damage;
	}
	boolean getDamage()
	{
		return this.damage;
	}
	public static void main(String[] args)
	{
		Inheritance a = new Inheritance("回血",50,true);
		System.out.println(""+a.name+' '+a.getPrice()+' '+a.damage);
	}
}
