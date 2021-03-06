package OCJPChap9;

public class TT_4 {
	private static int b = 0;
	private static int a = 0;

	public int read(){synchronized(this){return a+b;}}
	//public int read(){synchronized(a){return a+b;}} ....very important...only objects can be synchronized

	public void set(int a, int b){
		synchronized(this)
		{
			this.a=a;
			this.b=b;
		}
	}
}
/*
 * A. public int read(){return a+b;}
public void set(int a, int b){this.a=a;this.b=b;}

B. public synchronized int read(){return a+b;}
public synchronized void set(int a, int b){this.a=a;this.b=b;}

C. public int read(){synchronized(a){return a+b;}}
public void set(int a, int b){synchronized(a){this.a=a;this.b=b;}}

D. public int read(){synchronized(a){return a+b;}}
public void set(int a, int b){synchronized(b){this.a=a;this.b=b;}}

E. public synchronized(this) int read(){return a+b;}
public synchronized(this) void set(int a, int b){this.a=a;this.b=b;}

F. public int read(){synchronized(this){return a+b;}}
public void set(int a, int b){synchronized(this){this.a=a;this.b=b;}}
 * 
 * 
 B and F are correct. By marking the methods as synchronized, the threads will get the
lock of the this object before proceeding. Only one thread will be setting or reading at any
given moment, thereby assuring that read() always returns the addition of a valid pair.

A is incorrect because it is not synchronized; therefore, there is no guarantee that the values
added by the read() method belong to the same pair.
 C and D are incorrect; only objects can be used to synchronize on. 
 E fails �it is not possible to select other objects (even this)
to synchronize on when declaring a method as synchronized. (Objective 4.3)
 * 
 * 
 * */
