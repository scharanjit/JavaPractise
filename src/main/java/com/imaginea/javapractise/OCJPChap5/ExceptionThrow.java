package OCJPChap5;

public class ExceptionThrow {
	public static void main(String[] args) throws Exception {
		int m=5;
		int n = 0;
		try {
			m=m/0;		// change zero with any integer 
			n=12;
			n=n+m;
			numb();

		} catch (Exception e) {
			System.out.println("Exception Caught");
			System.out.println(m);
			throw e;  //--> un-comment the throw part...explaining the concept of catching throwing
		}

		System.out.println("If exception NOT THROWN ...Value of m we use here...");
		System.out.println("Program crashes "+n);  // wrong value of n
	}

	private static void numb() throws Exception {
		throw new Exception();
		
	}
}
