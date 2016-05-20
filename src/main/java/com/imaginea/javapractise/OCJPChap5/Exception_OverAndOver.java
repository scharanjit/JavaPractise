package OCJPChap5;

public class Exception_OverAndOver {
	static String s = "";
	public static void main(String[] args) {
		try {
			s += "1";
			throw new Exception();
		} catch (Exception e) { s += "2";
		} 
		finally {
			s += "3"; 
			doStuff(); 
			s += "4";
		}
		System.out.println(s);
	}
	static void doStuff() { int x = 0; int y = 7/x; }
}

/*It's true that the value of String s is 123 at the time that the divide-byzero
exception is thrown, but finally() is not guaranteed to complete, and in this case
finally() never completes, so the System.out.println (S.O.P.) never executes.*/