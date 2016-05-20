package OCJPChap3;
//preference order is
//self-->wrapper-->Object-->Variable

public class Bertha {
	static String s = "";
	public static void main(String[] args)
	{

		int x = 4;
		Boolean y = true; 
		short[] sa = {1,2,3};
		
		doStuff(x, y);//wid,wid
		doStuff(x);//wid bec var arg
		doStuff(sa, sa);//
		System.out.println(s);
	}
	static void doStuff(Object o) { s += "1"; }
	static void doStuff(Object... o) { s += "2"; }
	static void doStuff(Object o,Object o1) { s += "6"; }
	static void doStuff(Integer... i) { s += "3"; }
	static void doStuff(Long L) { s += "4"; }
	//static void doStuff(int i){ s +="9";}
	//static void doStuff(Integer i){ s+="5";}
	//static void doStuff(int i,boolean j){ s +="7";}
}