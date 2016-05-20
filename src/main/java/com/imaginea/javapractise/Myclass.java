public class Myclass {
	public int i;
	
	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public static void main(String args[]){

		Myclass x1=new Myclass();
		Myclass x2=new Myclass();
		x1.i=9;
		x2.i=47;
		System.out.print(x1.i);
		System.out.println(" "+x2.i);
		x1=x2;
		System.out.print(x1.i);
		System.out.println(" "+x2.i);
		//System.out.println(" "+x2.i);
		x1.i=27;
		//System.out.println(" "+x2.i);
		System.out.print(x1.i);
		System.out.println(" "+x2.i);
		
		
		System.out.println("---------------------------------------------");
		Myclass x1a=new Myclass();
		Myclass x2a=new Myclass();
		x1a.setI(9);
		x2a.setI(5);
		System.out.println(x1a.getI()+" "+x2a.getI());
		x1a=x2a;
		System.out.println(x1a.getI()+" "+x2a.getI());
		System.out.println();
		//System.out.println(" "+x2.i);
		x1a.setI(27);
		//System.out.println(" "+x2.i);
		System.out.println(x1a.getI()+" "+x2a.getI());
		System.out.println();
		//System.out.println(" "+x2.i);
	}
}
