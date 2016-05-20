package OCJP;

public class JavaBurst {
	

	public void gotcha()
	{
		
		motcha();
		
	}
	public void motcha()
	{
		
		gotcha();
		
	}
	
	
	
	
	public static void main(String[] args) {
		JavaBurst j = new JavaBurst();
		j.gotcha();
	}
}
