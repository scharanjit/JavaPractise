package j2ee1001;

public class testss{
	public void show(int a){
		System.out.println("One ");
	}
	public void show(int a, int b){
		System.out.println("Two ");
	}
	public void show(int... a){
		System.out.println("Three ");
	}
	public static void main(String args[]){
		testss t1= new testss();
		t1.show(21);
		t1.show(21, 22);
		t1.show(21, 22, 23,24);
	}
}
