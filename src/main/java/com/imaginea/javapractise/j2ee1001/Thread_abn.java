package j2ee1001;
public class Thread_abn extends Thread{ 
	public static void main(String args[]){ 
		Thread child = new Thread();
		child.start();
		
		//by deafult it is false
		System.out.println(child.isDaemon());
	} 
	public void run(){
		Thread t = new Thread();
		t.setName("a");
		t.setDaemon(true);
	}
}
