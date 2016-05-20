package HiHa;
//constructor shud be public it can't be void


public class Apple{
	void Apple()
	{
		System.out.println("1");
	}
	public static void main(String args[])
	{
		Apple apple1=new Apple();
		Apple apple2=new Apple(22);
	}
	public Apple(int i)
	{
		this();
		System.out.println(i);
	}
	public Apple() {
		
		System.out.println("kutta");
		return;
	}
}
