public class OverLoadTest
{
	public static void main(String[] args)
	{

		double c = sum(2.0,3.0);
		System.out.println("the result is: "+ c);
		System.out.println("the resursion result is: "+recursionSum(4));
		System.out.println("the frac result is : " + frac(4));

	}
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static float sum(float a, float b)
	{
		return a+b;
	}
	public static double sum(double a , double b)
	{
		return a+b;
	}
	public static long sum(long a,long b)
	{
		return a+b;
	}

	public static int recursionSum(int a)
	{
		
		if (a == 1)
		{
			return 1;
		}
		int sum = a + recursionSum(a-1);
		sum += 1;
		return sum;
		

	}
	public static int frac(int n)
	{
		if (n==1)
		{
			return 1;
		}
		int product = n*frac(n-1);
		product += 1;
		return product;
//2*1+1 = 3 frac(2)
//3*3+1 =10 frac(3)
//4*10+1 = 41 frac(4)
	}
}