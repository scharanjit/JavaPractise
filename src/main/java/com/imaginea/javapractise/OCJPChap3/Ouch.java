package OCJPChap3;

public class Ouch {
	static int ouch = 7;
	public static void main(String[] args) {
		new Ouch().go(ouch);
		System.out.print(" " + ouch);
	}
	void go(int ouch) {
		ouch++;
		//decalring ouch again
		//for(int ouch = 3; ouch < 6; ouch++);  //ouch is bad
			
		System.out.print(" " + ouch);
	}
}