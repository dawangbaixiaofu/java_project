//1.新建对象类必须实现Serializable接口
//2.ObejectOutputStream实现对象的序列化

import java.io.*;
public class SerialObjection 
{
	public static void main(String[] args)
	{
/*
		person p;
		FileOutputStream f;
		ObjectOutputStream op;

		try
		{
			p = new person("Tom",25);
			f = new FileOutputStream("E:\\GitHub\\a.txt");
			op = new ObjectOutputStream(f);
			op.writeObject(p);
			op.close();
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
*/
		try
		{
			//反序列化
			FileInputStream fin = new FileInputStream("E:\\GitHub\\a.txt");
			ObjectInputStream ois = new ObjectInputStream(fin);
			person pin = (person) ois.readObject();
			System.out.println(pin.getName()+" "+pin.getAge());
			ois.close();



		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}

class person implements Serializable
{
	String name;
	int age;
	public person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
}