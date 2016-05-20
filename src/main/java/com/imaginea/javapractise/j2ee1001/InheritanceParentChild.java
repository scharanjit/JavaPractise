package j2ee1001;
//RUNTIME ERROR
class t{
	void show(){
		System.out.println(" inside t");
	}
}
class s extends t{
	int show(int n){
		System.out.println(" inside s");
	
		s s1=(s) new t();
		return 1;
	}
}
public class InheritanceParentChild {
	public static void main(String args[])
	{ 
		
		t t1 = new s();
		
		t1.show();
		
		s sa = new s();
		
		sa.show(5);
		
		
	} 
}
