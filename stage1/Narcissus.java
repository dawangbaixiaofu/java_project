//Narcissus 水仙花数
public class Narcissus
{
	public static void main(String[] args)
	{
		int a,b,c;
		for (int i = 101;i<1000 ;i++ )
		{
			a=i%10; //个位数
			b=i/10%10; //十位数
			c=i/100; //百位数
			if (a*a*a+b*b*b+c*c*c==i)
			{
				System.out.println(""+i+','+" a: "+a+" b: "+b+" c: "+c);
			}
		}
	}
}