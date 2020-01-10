/*
java中的数组
数组声明
int list[];或者
int[] list;      首选

*/
public class Array
{
	public static void main(String[] args)
	{
		int[] mylist = {1,2,3,4,5,6};
		for (int i = 0;i<mylist.length ;i++ )
		{
			System.out.println(mylist[i]);
		}
	}
}