package HiHa;

public class Constru {
	
	
	public Constru()
	{
		int i=2;
		System.out.println("value of i: "+i);
	}


	public static void main(String[] args) {
		Constru obj= new Constru();
		Constru obj1= new Constru(33);
		
	}
	
	public Constru(int i) {
		// TODO Auto-generated constructor stub
	System.out.println("Value of new i : "+i);
	}
}
