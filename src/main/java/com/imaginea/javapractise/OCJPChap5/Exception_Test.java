package OCJPChap5;

//user defined exception

public class Exception_Test 
{
	public static void main(String[] args) throws Var, ClasssName 
	{
		int i=2;
		if(i>4)
		{
			throw new ClasssName();

		}
		else
		{
			throw new Var(i);
		}

	}
}
