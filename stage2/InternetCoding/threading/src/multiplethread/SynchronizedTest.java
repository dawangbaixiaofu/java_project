package multiplethread;
public class SynchronizedTest implements Runnable
{
	@Override
	public void run()
	{
		
	}
	public static void main(String[] args)
	{
		
	}
	
	public void test1()
	{
		synchronized(this)
		{
			int i = 5;
			while(i --> 0)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				
			}
		}
	}
}