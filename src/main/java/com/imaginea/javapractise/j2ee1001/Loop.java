package j2ee1001;

public  class Loop {

	static int i;
	public Loop(){
		i =10;
	}
	public void fun (int i){
		i=30;
		Loop obj = new Loop();
		obj.i=10;		
		obj.fun1(obj,i);		
		System.out.println("fun : "+obj.i);
	}
	public void fun1(Loop obj, int i){
		i=0;
		Loop lii = new Loop();
		obj = lii;
		System.out.println(i);
		System.out.println("fun 1 : "+obj.i);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop obj = new Loop();
		
		System.out.println("main : "+obj.i);
		obj.fun(obj.i);
	}

}
