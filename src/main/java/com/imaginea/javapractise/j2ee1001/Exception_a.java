package j2ee1001;
//8.	What is the output if “hello” is in args[0] -->c)	NumberFormatException


public class Exception_a {
	public static void main(String args[])
{
	try{
		int i = Integer.parseInt(args[0]);
		System.out.println(i);
	}
	catch(Exception e)
{ System.out.println(e); }
}
}
