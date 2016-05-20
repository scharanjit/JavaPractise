package OCJPChap8;

public class I_15HorseTest {
	static class Horse1 {
		public static String name;
		public Horse1(String s) {
			name = s;
		}
		
		public static String v1 ="Bhaluu";
	}
	public static void main(String[] args) {
		
		class Horse {
			public String name;
			public Horse(String s) {
				name = s;
			}
		}
		Object obj = new Horse("Zippo");
		
		//System.out.println(obj.name);    //name is inside inner class
	}
}

/*
 *E. Compilation fails because of an error on line 10
Answer:
 E. If you use a reference variable of type Object, you can access only those members
defined in class Object.
 * 
 * */
 