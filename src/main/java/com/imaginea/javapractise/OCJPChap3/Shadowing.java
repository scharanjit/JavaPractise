package OCJPChap3;

public class Shadowing {
	static int  xzx=29;
	shadow s1=new shadow();
	void changeIT(shadow s)
	{
		System.out.println("change it :-->"+s.fiz);
		s.fiz=99;
		System.out.println(s.fiz);
		s= new shadow();
		//this reference dies here only
		//so 420 shadowed
		s.fiz=420;
		System.out.println(s.fiz);
		
	}
	
public static void main(String[] args) {
	System.out.println("XZX:-->"+xzx);
	
	Shadowing s = new Shadowing();
	s.changeIT(s.s1);
	System.out.println("finally : "+s.s1.fiz);
	
}
}

class shadow
{
	int fiz=24;
	}
