public class Fiboracci
{
	public static void main(String[] args)
	{
		int f1=1,f2=1,f;
		int M=30;
		System.out.println(f1);
		System.out.println(f2);
		for(int i=3;i<=M;i++)
		{
			f=f2;
			f2=f1+f;
			f1=f;
			System.out.println(f2);

		}

		int a,b,c;
		a = 1;
		b = 2;
		System.out.println(""+a+','+b);
		c = a;
		a = b;
		b = c;
		System.out.println("after change the value is: "+a+','+b);

	}
}


//交换两个变量a,b的值
/*
int a,b,c;
c = a;
a = b;
b = c;

*/