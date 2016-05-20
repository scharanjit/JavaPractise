package j2ee1001;

public class zap implements foo{
	public void go(){
	System.out.print(BAR+ " ");
//	BAR=27; //line4
	}

	public static void main(String args[]){
		System.out.print(BAR);}}

	interface foo{
	int BAR=42;
	void go();}//line8
