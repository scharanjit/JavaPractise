package HiHa;

public class nonprimitive {
	public static void main(String[] args) {
		Integer a= new Integer(90);
		Integer b=new Integer(90);
		System.out.println(a);
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("yes");
		}
		if(a==b)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
		}
	}

}
