package j2ee1001;

class xj{
	void show(){
		System.out.println(" inside x");
	}
}
class yj extends xj{
	void show(){
		System.out.println(" inside y");
	}
}
public   class overide_zj{
	public static void main(String args[])
	{ xj x1 = new yj();
	x1.show();} }
