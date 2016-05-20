package OCJPChap4;


interface Vessel { }
interface Toy { }
class Boat implements Vessel { }
class Speedboat extends Boat implements Toy { }
public class Tree {
	public static void main(String[] args) {
		String s = "0";
		Boat b = new Boat();
		Boat b2 = new Speedboat();
		Speedboat s2 = new Speedboat();
		if((b instanceof Vessel) && (b2 instanceof Toy)) s += "1";
		if((s2 instanceof Vessel) && (s2 instanceof Toy)) s += "2";
		System.out.println(s);
	}
}

/*First, remember that instanceof can look up through multiple levels of an
inheritance tree. Also remember that instanceof is commonly used before attempting
a downcast, so in this case, after line 15, it would be possible to say Speedboat s3 =
(Speedboat)b2;.*/