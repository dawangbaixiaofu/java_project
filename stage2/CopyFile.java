//copy file according to byte streaming

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile
{
	public File src;
	public File desc;
	public CopyFile(String srcFile,String desFile)
	{
		src = new File(srcFile);
		desc = new File(desFile);
	}
	public static void main(String[] args)
	{
		CopyFile c = new CopyFile("E:/GitHub/java_project/stage2/Stream.txt","E:/GitHub/des.txt");
		c.copyTo();
		
	}
	public void copyTo()
	{
		//变量声明在外部，让作用范围可以涉及到在finally中
		InputStream in = null;
		OutputStream out = null;

		try
		{
			in = new FileInputStream(src);
			out = new FileOutputStream(desc);
			byte[] buffer = new byte[10];
			int len = -1;

			while ((len = in.read(buffer)) != -1)
			{
				System.out.println(new String(buffer,0,len));
				out.write(buffer,0,len);
			}

			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (null != in || null != out)
			{
				try
				{
					in.close();
					out.close();
					
				}
				catch (IOException e)
				{
					e.printStackTrace();

				}
				
			}
			
			
		}
		


	}

}