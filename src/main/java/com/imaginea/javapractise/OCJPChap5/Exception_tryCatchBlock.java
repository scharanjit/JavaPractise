package OCJPChap5;

public class Exception_tryCatchBlock {

	public static void main(String[] args) {
		try {
			// do stuff
		}
		//System.out.print("below the try"); //Illegal!
		catch(Exception ex) { }



		try {
			// do stuff
		}
		// can't have code between try/catch
		//System.out.println("out of try block");
		catch(Exception ex) { }



		//try {
		// do stuff
		//}
		// need a catch or finally here
		System.out.println("out of try block");



		try {
			// do stuff
		} finally {
			//clean up
		}

		try {
			// do stuff
		} catch (Exception ex) {
			// do exception handling
		} finally {
			// clean up
		}



		doStuff();

	}






	static void doStuff() {
		doMoreStuff();
	}
	static void doMoreStuff() {
		int x = 5/0; // Can't divide by zero!
		// ArithmeticException is thrown here
	}

}
