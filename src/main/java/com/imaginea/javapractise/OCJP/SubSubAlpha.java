package OCJP;
// A class can extend only one constructor at a time


class Alpha 
{
	static String s = "-";
	protected Alpha() 
	{
		s += "alpha "; 
	}
}
class SubAlpha extends Alpha 
{
	public SubAlpha()     //change constructor signature to public
	{ 
		s += "sSub "; 
	}
}
public class SubSubAlpha extends Alpha
{
	private SubSubAlpha()
	{ 
		s += "subsub "; 
	}
	public static void main(String[] args) 
	{
		new SubSubAlpha();
		System.out.println(s);
	}
}
//Watch out, SubSubAlpha extends Alpha! Since the code doesn’t attempt
//to make a SubAlpha, the private constructor in SubAlpha is okay.