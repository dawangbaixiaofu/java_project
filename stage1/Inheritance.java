//�̳���μ̳жԹ��캯���ļ̳��Ѿ���չ
//���ڴ������Ĺ��캯��������ʹ��super()��ʹ�ø���Ĺ��캯��
public class Inheritance extends ProjectOne
{
	public boolean damage;
	Inheritance(String name,int price,boolean damage)
	{
		super(name,price);
		this.damage = damage;
	}
	boolean getDamage()
	{
		return this.damage;
	}
	public static void main(String[] args)
	{
		Inheritance a = new Inheritance("��Ѫ",50,true);
		System.out.println(""+a.name+' '+a.getPrice()+' '+a.damage);
	}
}
