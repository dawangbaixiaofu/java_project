//this  ��̬�����ͷǾ�̬����

//��̬�����ͷǾ�̬����������
/*
1.��̬�������������У���ʵ����ǰ����ʹ�ã�
2.�Ǿ�̬�������Է������е��κγ�Ա����̬����ֻ�ܷ������еľ�̬��Ա��
3.��̬��������ʵ����ǰ�Ϳ���ʹ�ã������еķǾ�̬����������ʵ����֮����ܷ����ڴ棻
4.static�ڲ�ֻ�ܳ���static����������static����!
	����static�����л�����ʹ��this�ȹؼ���

����Ҫ�����𣺾�̬�����ڴ�������ǰ�Ϳ���ʹ���ˣ��Ǿ�̬��������ͨ��new�����Ķ�����á�
	Ҳ����˵�Ǿ�̬����Ҫ��ʵ�������ܱ���̬�������á�
*/


public class ThisTest
{
	private int i = 10;
	public static void main(String[] args)
	{
		ThisTest test = new ThisTest();
		test.this_test();
	}

	public void this_test()
	{
		int i = 1;
		int a = this.i;
		System.out.println("���this.i��ֵ��"+a);
	}
}