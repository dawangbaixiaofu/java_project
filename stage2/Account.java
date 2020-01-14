public class Account
{
	//��ʼ���˻����Ϊ0
	float balance=0;
	String userNo;
	public Account(String userNo)
	{
		this.userNo = userNo;
	}

	public float getBalance()
	{
		return balance;
	}

	public void deposit(float money)
	{
		balance += money;
	}

	public void withdraw(float money) throws OverdraftException
	{
		float balance_1 = balance - money;
		if (balance_1 < 0)
		{
			throw new OverdraftException(userNo+"�û�ȡ����ڴ����͸֧���ܽ���ȡǮ��");
		}
		else
		{
			balance = balance_1;
			System.out.println(userNo+"�û�ȡ��ɹ�����ǰ��"+balance);
		}
	}

	public static void main(String[] args)
	{
		Account user1 = new Account("007");
		user1.deposit(100);
		//user1.withdraw(50);
		System.out.println("��ǰ�û���"+user1.getBalance());
		try
		{
			user1.withdraw(600);
		}
		catch (OverdraftException e)
		{
			System.out.println("the reason of exceptio is: "+e.getMessage());
			e.printStackTrace();
		}


	}
}

class OverdraftException extends Exception
{
	
	public OverdraftException(String msg)
	{
		super(msg);
	}
}