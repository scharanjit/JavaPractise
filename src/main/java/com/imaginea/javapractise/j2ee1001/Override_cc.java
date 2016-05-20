package j2ee1001;

class ac{
	final void show(){
		System.out.println(" inside a");
	}
}
class bc extends ac{
   //void show(){System.out.println(" inside b");}
}
public   class Override_cc{
	public static void main(String args[])
	{ ac a1 = new bc();
	a1.show();}}
