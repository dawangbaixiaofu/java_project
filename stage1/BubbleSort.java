//bubble sort 
import java.util.Scanner;
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0;i<a.length ;i++ )
		{
			a[i]=input.nextInt();
		}
		int[] b = sort(a);
		for (int i = 0;i<b.length ;i++ )
		{
			System.out.println(b[i]);
		}
	}

	public static int[] sort(int[] a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				if (a[i]>a[j])
				{
					int t = a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
}