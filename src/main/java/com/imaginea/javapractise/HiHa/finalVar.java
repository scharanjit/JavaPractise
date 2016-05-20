package HiHa;

public class finalVar {
	final  int ival=1;
	
	public finalVar() {
	//	ival++;
	}
	

	public  void  show()
	{
		char ival='5';
	}
 public static void main(String[] args) {
	
	 finalVar f = new finalVar();
	 f.show();
	 
	 System.out.println(f.ival);
	 
}
}
