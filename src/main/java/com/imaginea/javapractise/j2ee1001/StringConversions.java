package j2ee1001;

public class StringConversions {
	public static void main(String[] args) {
		int a= 5;
		Integer z= new Integer(a);
		System.out.println(z);
		
		//int c= z.toString();
		String k = z.toString();
		System.out.println("k : "+k);
		System.out.println(z.toString());
		
		/*if (z.toString()>3)
		{
			System.out.println("YEs");
		}*/
	
	
		Integer a1= new Integer(2);
		Integer b1= new Integer(2);
		
		if(a1==b1) //comparing address...adddress of two obhjects always differ
		{
			System.out.println("YESSSSSSSSSSSSss");
		}
		
		if(a1.equals(b1))
		{
			System.out.println(".equals");
		}
		
		
		
		String ax ="abc";
		String bx = "abc";

		if(ax==bx){
		System.out.println("a and b are equal.");
		}else System.out.println("a and b are not equal.");
		
		
			int i=10;
			int j=0;
			i=i++;
			
			System.out.println("i : " +i);
			System.out.println("j : " +j);
			
			j=i++;
			
			System.out.println("i : " +i);
			System.out.println("j : " +j);
			
			
			
			System.out.println("------------------------------------");
			
			Character c1	= new Character('A');
			Character c2 = new Character('A');
			System.out.println((c1==c2)+"\t");
			System.out.println(c1.equals(c2));




	}

}
