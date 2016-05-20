package j2ee1001;

class shell
{
	private int i;
	private int j;
	shell(){ i=9;j=0;}  



	class kernel
	{
		void show(){ System.out.println(i);}
	}

	void showcase()
	{ 
		kernel k1 = new kernel();
		k1.show();
	}
}
public class internalclass_trymedd
{
	public static void main(String args[])
	{ 
		shell s1 = new shell();
		s1.showcase();
	}
}
