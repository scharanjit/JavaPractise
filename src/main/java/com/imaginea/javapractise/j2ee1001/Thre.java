package j2ee1001;

public class Thre extends Thread {
	static long startTime;
	public void run() {
		for (int i = 0; i < 99999; i++) {Math.sin(i);}
		String name = Thread.currentThread().getName();
		long time = System.currentTimeMillis();
		System.out.println(name + " done at " + (time - startTime));
	}
	public static void main(String[] args) {
		Thre t1 = new Thre(); Thre t2 = new Thre();
		t1.setName("T1"); t2.setName("T2");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		startTime = System.currentTimeMillis();
		t1.start();
		t2.start();
	}
}


/*The priority assigned to thread T2 is greater than the priority assigned to T1,--correct answer
Java guarantees that thread T2 will get more CPU time than T1
Java guarantess that thread T2 will run to completion before T1
None of the above
*/