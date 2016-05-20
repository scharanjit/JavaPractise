package HiHa;
// converting object of wrapper class into its primitive data type is un-boxing
//advantage of wrapper:- primitve data types are not objects...sometimes we want to deal with variable as objects
public class UnboxingExample {
	public static void main(String[] args) {
		Integer i= new Integer(-8);
		System.out.println(i);
		int abs= absolute(i);
		System.out.println("The abs of"+i+" abs : "+abs);
	}

	private static int absolute(int i) {
		System.out.println("Value in function of i :"+i);
		return (i<0? -i :i);
	}

}
