//101-200之间的素数
public class PrimeNumber
{
	public static void main(String[] args)
	{
		int count=0;
		for(int i=101;i<200;i+=2)
		{
			boolean flag = true;
			for(int j=2;j<Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if (flag==true)
			{
				count+=1;
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
}

//editplus 使用技巧，输入if 或者 for 后直接回车符号自动补全