package OCJP;
//zoo is a default class

public class MooAccessModifier extends zoo{
	
	public void overirde()
	{
		System.out.println(this.coolBaby());
		zoo z =new zoo();
		
		System.out.println("Zoo says : "+z.coolBaby());
	}
	
	
	public static void main(String[] args) {
	 
		MooAccessModifier m = new MooAccessModifier();
		
		m.overirde();
		
	}

}
