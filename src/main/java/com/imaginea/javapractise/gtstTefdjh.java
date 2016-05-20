

class a 
{
	public int i;

	public int getI() {
		System.out.println(i);
		return i;
		
	}

	public void setI(int i) {
		this.i = i;
		
	}
}
public class gtstTefdjh
{
	public void meth(){
	a a1=  new a();
	a1.setI(10);
	
	a1.getI();
   a1.i=-6;
   System.out.println(a1.i);
  //  a1.i=2.0;
	}
	
	public static void main(String[] args) {
		gtstTefdjh j = new gtstTefdjh();
		j.meth();
		a a2=  new a();
		a2.getI();
	}
}
