//Throwable���࣬Exception��Error���̳��˸���
import java.io.File;
import java.io.FileInputStream;
public class ThrowableTest
{
	public static void main(String[] args)
	{
		File f = new File("d/LOL.exe");
		try
		{
			new FileInputStream(f);

		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}

}