package j2ee1001;

public class InnerClass {
	
	class xz
	{
		public void bx()
		{
			System.out.println("correct way");
		}
	}
	
	public static void main(String[] args) {
		InnerClass.xz b = new InnerClass().new xz();
		b.bx();
		
		
		
		
	}
}
