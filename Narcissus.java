//Narcissus ˮ�ɻ���
public class Narcissus
{
	public static void main(String[] args)
	{
		int a,b,c;
		for (int i = 101;i<1000 ;i++ )
		{
			a=i%10; //��λ��
			b=i/10%10; //ʮλ��
			c=i/100; //��λ��
			if (a*a*a+b*b*b+c*c*c==i)
			{
				System.out.println(""+i+','+" a: "+a+" b: "+b+" c: "+c);
			}
		}
	}
}