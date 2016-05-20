package HiHa;
//Strings are immutable..if we assign s1.concat to s2 then s2 will print InfyTech or v print sysout(s1.concat)

public class Strigss {
	public static void main(String[] args) {
		String s1="Infy";
		s1.concat("Tech");
		System.out.println(s1);
		System.out.println(s1.concat("tech"));
	}

}
