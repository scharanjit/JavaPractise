package OCJP;

public class StaticFrog
{
	int frogSize = 0;
	public int getFrogSize()
	{
		return frogSize;
	}
	public StaticFrog(int s) 
	{
		frogSize = s;
	}
	public static void main (String [] args) 
	{


		StaticFrog f = new StaticFrog(25);
		System.out.println(f.getFrogSize()); // Access instance
		// method using f
	}
}
