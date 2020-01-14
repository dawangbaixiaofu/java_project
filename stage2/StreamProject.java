import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamProject
{
	public static void main(String[] args)
	{
		try
		{
			File f = new File("E:/GitHub/java_project/stage2/Account.java");
			FileInputStream fis = new FileInputStream(f);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		

	}
}