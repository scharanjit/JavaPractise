package OCJPChap4;

//And the command-line invocation:  java Fork live2

public class Fork {
	public static void main(String[] args) {
		if(args.length == 1 | args[1].equals("test")) {
			System.out.println("test case");
		} else {
			System.out.println("production " + args[0]);
		}
	}
}

/*
 * E. An exception is thrown at runtime
Answer:
 E is correct. Because the short circuit (||) is not used, both operands are evaluated. Since
args[1] is past the args array bounds, an ArrayIndexOutOfBoundsException is thrown.
 * */
 