//try {} catch {} finally {}

//finally 无论是否出现异常，finally中的代码都会被执行

//throws 函数1调用函数2的时候，函数2对异常进行抛出，不在函数2中进行异常处理
//函数1接收到异常（catch住）进行异常处理。

//throw 和 throws的区别？
//throws出现在方法函数头；而throw出现在函数体。


//异常的种类
/*
1.checked exeception 可查异常
	可查异常即必须进行处理的异常;（try catch）如果不处理，编译器，就不让你通过
	比如 FileNotFoundException
2.runtimeException 运行时异常
	即便不进行try catch，也不会有编译错误
	例子：
	除数不能为0异常:ArithmeticException
	下标越界异常:ArrayIndexOutOfBoundsException
	空指针异常:NullPointerException
3.error 错误
	错误也是不要求强制捕捉的
	例如：
	OutOfMemoryError
	系统级别的异常，通常是内存用光了
	在默认设置下，一般java程序启动的时候，最大可以使用16m的内存
	如例不停的给StringBuffer追加字符，很快就把内存使用光了。抛出OutOfMemoryError
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
			System.out.println("d:/LOL.exe不存在");
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
		System.out.println("试图打开 d:/LOL.exe");
		//试图打开文件LOL.exe，会抛出FileNotFoundException，
		//如果不处理该异常，就会有编译错误
		new FileInputStream(f);
		System.out.println("成功打开");
	}
}

