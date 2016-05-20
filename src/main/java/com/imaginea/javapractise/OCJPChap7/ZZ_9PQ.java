package OCJPChap7;
import java.util.*;


//queue FIFO

public class ZZ_9PQ {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		 pq.add("2");
		 pq.add("4");
		// pq.add("5");
		 System.out.println(pq);              //2,4
		 System.out.print(pq.peek() + " ");  //2
		System.out.println("");
		 System.out.println(pq);  
		 pq.offer("1");
		 System.out.println(pq);   //1,4,2
		 pq.add("3");
		 System.out.println(pq); //1,3,2,4
		 pq.remove("1");
		 System.out.println("removed :---"+pq); //2,3,4 
		 System.out.print(pq.poll() + " ");
		 System.out.println("");
		 System.out.println("polled data:-"+pq);
		 if(pq.remove("2")) System.out.print(pq.poll() + " ");
		 System.out.println(pq.poll() + " --" + pq.peek());
		 
		 System.out.println(pq);
	}

}

/* peek() returns the highest priority element in the queue without removing it, and 
 * poll() returns the highest priority element, AND removes it from the queue.*/
 

/*
 *B is correct. For the sake of the exam, add() and offer() both add to (in this case),
naturally sorted queues. The calls to poll() both return and then remove the first item
from the queue, so the if test fails. 
 * */
 