//try {} catch {} finally {}

//finally �����Ƿ�����쳣��finally�еĴ��붼�ᱻִ��

//throws ����1���ú���2��ʱ�򣬺���2���쳣�����׳������ں���2�н����쳣����
//����1���յ��쳣��catchס�������쳣����

//throw �� throws������
//throws�����ڷ�������ͷ����throw�����ں����塣


//�쳣������
/*
1.checked exeception �ɲ��쳣
	�ɲ��쳣��������д�����쳣;��try catch��������������������Ͳ�����ͨ��
	���� FileNotFoundException
2.runtimeException ����ʱ�쳣
	���㲻����try catch��Ҳ�����б������
	���ӣ�
	��������Ϊ0�쳣:ArithmeticException
	�±�Խ���쳣:ArrayIndexOutOfBoundsException
	��ָ���쳣:NullPointerException
3.error ����
	����Ҳ�ǲ�Ҫ��ǿ�Ʋ�׽��
	���磺
	OutOfMemoryError
	ϵͳ������쳣��ͨ�����ڴ��ù���
	��Ĭ�������£�һ��java����������ʱ��������ʹ��16m���ڴ�
	������ͣ�ĸ�StringBuffer׷���ַ����ܿ�Ͱ��ڴ�ʹ�ù��ˡ��׳�OutOfMemoryError
*/

//package stage2;
  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
  
public class TestException {
  
    public static void main(String[] args) {
  
		try
		{
			method2();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
		}
		finally
			{
				System.out.println("finally!hehe..");
			}
        
          
    }

	public static void method2() throws FileNotFoundException
	{
		File f= new File("d:/LOL.exe");
		System.out.println("��ͼ�� d:/LOL.exe");
		//��ͼ���ļ�LOL.exe�����׳�FileNotFoundException��
		//�����������쳣���ͻ��б������
		new FileInputStream(f);
		System.out.println("�ɹ���");
	}
}

