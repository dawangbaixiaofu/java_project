//�Զ����쳣
//���ø���Ĺ��췽�� �����ݲ����������쳣��ԭ����throw��ʱ����쳣ʵ�����г�ʼ��
//����Ҫ����throws ���쳣����throws
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
			//throw �׳��쳣 �����쳣ʵ�����г�ʼ���������쳣��ԭ��
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