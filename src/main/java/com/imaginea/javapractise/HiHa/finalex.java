package HiHa;

public class finalex {

	int ival=1001;
	//int ival1;
	/*final  void nidipagal() {
		int m=56;

	}*/

	/*public finalex()
	{
		ival ++;

	}*/
	public final int  show() 
	{
		int ival=5;
		System.out.println(ival);
		return ival;



	}

	public static void main(String[] args) throws ApplicationException {
		//ival1=ival++;
		//finalex obj= new finalex();
		//obj.show();
		//System.out.println(obj.ival);

		try{
			int i=5/0;
		}
		catch(Exception e)
		{
			System.out.println("Hi");
		}
		//bad practise of exceptioon handling
		//System.out.println(i);
		finalex f = new finalex();
		f.show();
		//throw new Exception1();

	}
}