//5!ʹ�õݹ�ķ�ʽ
public class Recursion_1
{
	public static void main(String[] args)
	{
		System.out.println(frac(5));
	}
	public static int frac(int i)
	{
		if (i==1)
		{
			return 1;
		}
		else
		{
			return i*frac(i-1);
		}
	}

}