package OCJPChap4;


public class SpecialOps {
	public static void main(String[] args) {
		String s = "";
		Boolean b1 = true;
		Boolean b2 = false;
		if((b2 = false) | (21%5) > 2) s += "x";
		if(b1 || (b2 = true)) s += "y";  //does nt waste time in iterationg b2...bec b1 became true
		if(b2 == true) s += "z";
		System.out.println(s);
	}
}