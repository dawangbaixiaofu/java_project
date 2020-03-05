import java.io.*;

public class exceptionTest1 
{
	public static void main(String[] args) throws Exception
	{
		try{
			FileInputStream f = new FileInputStream("a.sdkx");
		}
		finally
		{
			System.out.println("try finally test successfully!");
		}
		

	}
}