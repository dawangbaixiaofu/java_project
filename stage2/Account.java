public class Account
{
	//初始化账户余额为0
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
			throw new OverdraftException(userNo+"用户取款大于存款，造成透支不能进行取钱！");
		}
		else
		{
			balance = balance_1;
			System.out.println(userNo+"用户取款成功。当前余额："+balance);
		}
	}

	public static void main(String[] args)
	{
		Account user1 = new Account("007");
		user1.deposit(100);
		//user1.withdraw(50);
		System.out.println("当前用户余额："+user1.getBalance());
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