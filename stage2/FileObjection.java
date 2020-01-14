import java.io.File;
import java.io.IOException;

public class FileObjection
{
	public static void main(String[] args)
	{
		File f = new File("C:/WINDOWS/");
		File[] fs = f.listFiles();
		for (File a:fs)
		{
			System.out.println(a);
		}
	}
}