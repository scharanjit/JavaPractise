package OCJPChap9;

public class TTT_17Chess implements Runnable {
	public void run() {
		move(Thread.currentThread().getId());
	}
	// insert code here

	synchronized void move(long id) {
		// void move(long id) {
		System.out.print(id + " ");
		System.out.print(id + " ");
	}
	public static void main(String[] args) {
		TTT_17Chess ch = new TTT_17Chess();
		new Thread(ch).start();
		new Thread(new TTT_17Chess()).start();
	}
}


/*And given these two fragments:
I. synchronized void move(long id) {
II. void move(long id) {
When either fragment I or fragment II is inserted at line 7, which are true? (Choose all that apply.)
A. Compilation fails
B. With fragment I, an exception is thrown
C. With fragment I, the output could be 4 2 4 2
D. With fragment I, the output could be 4 4 2 3
E. With fragment II, the output could be 2 4 2 4
Answer:
 C and E are correct. E should be obvious. C is correct because even though move() is
synchronized, it's being invoked on two different objects.*/