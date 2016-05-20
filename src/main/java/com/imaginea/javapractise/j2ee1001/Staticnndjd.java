package j2ee1001;

class test{
	static int l;
	static void show()
	{
		System.out.println(l);
		}
	}

public class Staticnndjd{
	
	private int m ;
	public static void amethod()
	{
		//System.out.println(m);
	}
	
	
	public static void main(String args[])
	{ test t1 = new test();test.show();}
}

