package j2ee1001;
public class Inner_zero
{
	class one
	{
		private class two //here we have private class
		{   
			public  void main ()
			{
				System.out.println("two");
			}
		}
		/**/
	}

	public static void main(String[] args) 
	{
		Inner_zero.one.two n= new Inner_zero().new one().new two();	
		n.main();

	}

}


/*private*/class one1

{ 
	//A class can never be private in general


}

