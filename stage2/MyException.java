//自定义异常
//调用父类的构造方法 并传递参数，给出异常的原因在throw的时候对异常实例进行初始化
//方法要进行throws 对异常进行throws
public class MyException
{
	public String name;
	float hp;
	public MyException(String name,float hp)
	{
		this.name = name;
		this.hp = hp;
	}
	public void attackHero(MyException h) throws EnemyIsDeadException
	{
		if (h.hp == 0)
		{
			//throw 抛出异常 并对异常实例进行初始化，给出异常的原因
			throw new EnemyIsDeadException(h.name+" was dead");
		}
	}

	public static void main(String[] args)
	{
		MyException garen = new MyException("garen",600);
		MyException teemo = new MyException("teemo",0);
		try
		{
			garen.attackHero(teemo);
		}
		catch (EnemyIsDeadException e)
		{
			System.out.println("the reason of exceptio is: "+e.getMessage());
			e.printStackTrace();
		}

		

	}

}

class EnemyIsDeadException extends Exception
{
	//construct method
	public EnemyIsDeadException(String msg)
	{
		super(msg);
	}
}