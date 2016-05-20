package hihi;


//A race condition occurs when two or more threads can access shared data and they try to change
//it at the same time. Because the thread scheduling algorithm can swap between threads at any time,
//you don't know the order in which the threads will attempt to access the shared data. 
//Therefore, the result of the change in data is dependent on the thread scheduling algorithm, i.e.
//both threads are "racing" to access/change the data.

public class ThreadRaceCondition {

	
	public static void main(String[] args) {
		int x=0;
		int y=0;
		if (x == 5) // The "Check"
		{
		   y = x * 2; // The "Act"

		   // If another thread changed x in between "if (x == 5)" and "y = x * 2" above,
		   // y will not be equal to 10.
		}
		
		//provide lock to x...
	}
}
