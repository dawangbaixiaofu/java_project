public class MinValue
{
	public static void main(String[] args)
	{
		int[] a = new int[5];
		a[0] = (int)(Math.random()*100);
		a[1] = (int)(Math.random()*100);
		a[2] = (int)(Math.random()*100);
		a[3] = (int)(Math.random()*100);
		a[4] = (int)(Math.random()*100);

		int small_least = 101;
		//增强型for循环
		for (int i : a)
		{
			System.out.println(i);
		}

		for (int i = 0;i<a.length ;i++ )
		{
			
			if (a[i]<small_least)
			{
				small_least = a[i];
			}
		}
		System.out.println("The Min Value is: "+small_least);


	}
}