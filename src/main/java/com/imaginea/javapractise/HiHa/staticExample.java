package HiHa;

public class staticExample {
	 int p=1;
	 int q;
	public staticExample()
	{
		q=p+1;
		
	}
	
	public static void main(String[] args) {
		staticExample s= new staticExample();
		
		System.out.println("p= "+s.p);
		staticExample s1= new staticExample();
		System.out.println("q= "+s1.q);
	}
	

} 	 
