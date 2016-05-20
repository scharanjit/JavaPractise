package OCJPChap5;

public class labledBreakLoop {

	public static void main(String[] args) {


		boolean isTrue = true;
		outer:
			for(int i=0; i<5; i++) {
				while (isTrue) {
					System.out.println("Hello");
					break outer;
				} // end of inner while loop
				System.out.println("Outer loop."); // Won't print
			} // end of outer for loop
		System.out.println("Good-Bye");
		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		outer1:
			for (int i=0; i<5; i++)
			{
				for (int j=0; j<5; j++)
				{
					System.out.println("Hello");
					continue outer1;
				} // end of inner loop
				System.out.println("outer"); // Never prints
			}
		System.out.println("Good-Bye");

	}
}
