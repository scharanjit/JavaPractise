package j2ee1001;

public  class SwitchStatement {
	public static void main(String args[]) { 
		int i, j=1;
		i = (j>1)?2:1;
		switch(i) {
		case 0: System.out.println(0); break;
		case 1: System.out.println(1);
		case 2: System.out.println(2); break;
		case 3: System.out.println(3); break;
		}
		
		
		
		System.out.println("----------------------------------------------");
		
		int Di=0, Dj=2;
			      do {
			         Di=++Di;
			         Dj--;
			      } while(Dj>0);
			      System.out.println(Di);

		
	}
}
