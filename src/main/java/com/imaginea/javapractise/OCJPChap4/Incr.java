package OCJPChap4;

public class Incr {
	public static void main(String[] args) 
	{
		Integer x = 7;
		int y = 2;
		x *= x;
		System.out.println(x); //49
		y *= y;
		System.out.println(y);//4
		y *= y;
		System.out.println(y);//16
		x -= y;
		System.out.println(x);//33
}
}