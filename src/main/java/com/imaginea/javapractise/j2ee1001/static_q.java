package j2ee1001;

class p{
	int i;
	char c;
	/*static p(int i, char c)    //constructor can't be static
	{
		this.i = i;
		this.c = c;
	}*/
	void show(){ 
		System.out.println(i);
		System.out.println(c);
	}
}
class  static_q{
	public static void main(String args[])
	{
	//	p p1 = new p(12,'c');

		//p1.show();
	}
}
