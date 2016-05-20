package OCJPChap6;



public class Ex15TKO {	
	public static void main(String[] args)
	{
		String s = "-";
		Integer x1= new Integer("32");
		System.out.println("This is NOT  string : "+x1);
		x1=x1+1;
		System.out.println(x1);
		Integer x = 343;
		long L343 = 343L;
		int xm=343;
		System.out.println("L343 : "+L343);
		if(xm==L343)System.out.println("HAWWWWWWWWWWWWWWWWWWWWWWw");
		if(x.equals(L343)) s += ".e1 ";			
		System.out.println(s);
		if(x.equals(343)) s += ".e2 ";			
		System.out.println(s);

		Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));		//343/49=7

		if(s1 == 7) s += "=s ";
		if(s1 < new Integer(7+1)) s += "fly ";

		System.out.println(s);
	}
}