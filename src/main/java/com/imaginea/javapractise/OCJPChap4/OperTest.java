package OCJPChap4;

public class OperTest {
	
	public static void main(String[] args) {
	/*	if(args.length == 1 | args[1].equals("test")) {
			System.out.println("test case");
			} else {
			System.out.println("production " + args[0]);
			}
	
	 /*
	  * Because the short circuit (||) is not used, both operands are evaluated. Since
		args[1] is past the args array bounds, an ArrayIndexOutOfBoundsException is thrown

	  */
		
		
		//CONCEPT IS LEFT TO RIGHT EXECUTION-->
		
		Long x = 42L;
		Long y = 44L;
		System.out.print(" " + 7 + 2 + " ");
		System.out.print(foo() + x + 5 + " ");
		System.out.println(x + y + foo());
	}

	static String foo() { return "foo"; }
}
