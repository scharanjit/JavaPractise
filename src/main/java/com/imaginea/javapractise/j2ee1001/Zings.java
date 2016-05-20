package j2ee1001;
//remove static
	class tempu{
		static void tryme(){
			System.out.println("First");
		}
	}
	
	class tempu2 extends tempu{
		static void tryme(){
			System.out.println("Second");
		}
	}

public class Zings {
	public static void main(String[] args) {
		tempu g = new tempu();
		g.tryme();
		tempu g1 = new tempu2();
		g1.tryme();
		
		System.out.println("output : "+17+3);
	}

}
