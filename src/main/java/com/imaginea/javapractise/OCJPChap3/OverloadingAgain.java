package OCJPChap3;

//Overlaoding concept with widening, auto boxing & var-args

public class OverloadingAgain {
			
	static void go(int x) { System.out.println("int "); }
	static void go(long x) { System.out.println("long "); }
	static void go(double x) { System.out.println("double "); }
	
	//when an exact match isn't found, the JVM uses the method with the
	//smallest argument that is wider than the parameter
	
	public static void main(String [] args) {
		byte b = 5;
		short s = 5;
		long l = 5;
		float f = 5.0f;
		System.out.println("-Widening & narrowing-");
		go(b);
		go(s);
		go(l);
		go(f);
		
		
		System.out.println("----------------------------------");
		int i = 5;
		go1(i);
		
		
		byte b23 = 5;
		go2(b23,b23);
		go2(b23,b23,b23);
		go2(b23,b23,b23,b23,b23);
		
	}
	
	
	static void go1(Integer x) { System.out.println("Integer"); }
	static void go1(long x) { System.out.println("long"); }				//compiler will choose widening over boxing

	static void go2(Byte x, Byte y,Byte z) { System.out.println("Boxing"); }//Compiler prefer Boxing over var args
	static void go2(byte... x) { System.out.println("Var args "); }         //Compiler will choose var-args over boxing
	//static void go2(Byte... x) { System.out.println("Var args "); } 
	
	static void go2(int x, int y) { System.out.println("Widening "); }    // Compiler will choose widening over Bozing & var args
	static void go2(Byte x, Byte y) { System.out.println("Boxing----------2 "); }						
	
	// Widening --->  ---> Boxing --->Var arg{Overloading}
}

