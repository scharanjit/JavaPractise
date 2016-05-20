package OCJPChap4;

public class Feline {
	public static void main(String[] args)
	{
		Long x = 42L;
		Long y = 44L;
		System.out.print(" " + 7 + 2 + " ");  //System.out.print(7 + 2 + " ");
		System.out.print(foo() + x + 5 + " ");
		System.out.println(x + y + foo());
	}
	static String foo()
	{
		return "foo";
	}
}

/*
 *Concatenation runs from left to right, and if either operand is a String,
the operands are concatenated. If both operands are numbers they are added together.
Unboxing works in conjunction with concatenation. 
 * 
 * */
