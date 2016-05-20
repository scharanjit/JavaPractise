package OCJP;

 class Overloadd {

		public int geeta(int r)
		{
			return 1;
			
		}
		
		public int geeta(int r,String num)
		{
			return 2;
			
		}
		
		public String geeta(int r,String num,int e)
		{
			return "5";
			
		}
		public String geeta(int r,String num,int e, char a) throws Exception
		{
			return "Exception vala luv";
			
		}
		 public String geeta1(int r,String num,char a,int e) 
			{
				return "Exception vala luv---geeta 1 parent";
				
			}
		 
		/* public String seeta1(int r,String num,char a,int e) 
			{
				return "Seeta (Overload)";
				
			}*/
}

 	
 
 public class OverloadExample extends Overloadd
 {
	 
	 //here geeta1 is over loaded...NOT over ridden
	 public String geeta1(int r,long num,char a,int e) throws Exception
		{
			return "Exception vala luv---geeta 1 child";
			
		}
	 
	 public String seeta1(int r,String num,char a,int e) 
		{
			return "Seeta NOT over riden";
			//beacuse argument are same
			// argument shud nt be same
			//OVERLOADED METHOD MUST CHANGE THE ARGUMENT LIST
			
		}
	 
	 public static void main(String[] args) throws Exception {
		 Overloadd d = new Overloadd();
		 OverloadExample c = new OverloadExample();
		 System.out.println(d.geeta(3));
		 System.out.println(d.geeta(3,"Seeta"));
		 System.out.println(d.geeta(3,"Sundi",4));
		 System.out.println(d.geeta(3,"Sundi",4,'E'));
		 
		 System.out.println(d.geeta1(5, "fds", 'a', 5));
		 System.out.println(c.geeta1(23, 5555555, 'a', 5)); //child
		 System.out.println(d.geeta1(23, "5555555", 'a', 5));
		 
		 
		 
		 //wat abt seeta...same access modifier,,same aregument
		 
		 System.out.println(c.seeta1(5, "ds", 'a', 2));
		 
		 
//	System.out.println(((Overloadd)new OverloadExample()).seeta1(5, "ds", 'a', 2));
		//though the o/p is overridden...but method should exist in parent class 
	}
 }
 
