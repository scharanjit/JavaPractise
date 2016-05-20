package j2ee1001;

class ab{
	 int i;
	char c;
	static  void  fun(int i, char c)
	{
		//this.i = i;
		//this.c = c;
	}
	void show(){ 
		System.out.println(i);
		System.out.println(c);
	}
}
class  static_bb{
	public static void main(String args[])
	{
		ab a1 = new ab();
		a1.fun(12,'v');
		a1.show(); 
	}
}
