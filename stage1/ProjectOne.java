public class ProjectOne
{
	private String name;
	private int price;
	//construct function
	ProjectOne(String name,int price)
	{
		this.name = name;
		this.price = price;
	}

	String getName()
	{
		return this.name;
	}
	
	int getPrice()
	{
		return price;
	}
	
	public static void main(String[] args)
	{
		ProjectOne item = new ProjectOne("Ѫƿ",50);
		String name = item.getName();
		System.out.println(name+'\n');
		int price = item.getPrice();
		System.out.println(price);
	}
}

//һ��Դ�ļ��п����ж���࣬����ֻ����һ��public��

/*
class construct
{
	public static void main(String[] args)
	{
		ProjectOne item = new ProjectOne("Ѫƿ",50);
		String name = item.getName();
		System.out.println(name+'\n');
		int price = item.getPrice();
		System.out.println(price);
	}
}


*/