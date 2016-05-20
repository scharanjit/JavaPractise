package j2ee1001;

public class Constructor_Copy 
{

	public Constructor_Copy()
	{
		//Here they should have called the method copy(), but they didn't.
	}
	public Constructor_Copy(String name)
	{
		System.out.println("2 nd constructor called");
	}
	public void copy()
	{
		System.out.println("some method");

	}
	public static void main(String args[])
	{
		Constructor_Copy copy = new Constructor_Copy();

	}

}