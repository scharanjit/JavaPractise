
public class hi extends Thread {
	
	void a()
	{
		Thread t = new Thread();
		t.setName("abc");
		System.out.println(t);
	}
	public static void main(String args[]) throws InterruptedException
	
	{
		Thread t = new Thread();
		t.setName("CJAA");
		System.out.println(t);
		t.setName("AABC");
		System.out.println(t);
	
		hi h= new hi();
		h.a();
		
		
		  

	}

}
