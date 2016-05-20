package OCJPChap5;

public class Clumsy {
	public static void main(String[] args) {
		int j = 7;
		assert(++j > 7);
		assert(++j > 8): "hi";
		assert(j > 10): j=12;
		assert(j==12): doStuff();
		assert(j==12): new Clumsy();
	}
	static void doStuff() { }
}
 
 /*When an assert statement has two expressions, the second expression must
return a value. The only two-expression assert statement that doesn’t return a value is on
line 9.*/