package OCJPChap7;
//first-in, first-out by default
//BUT a PriorityQueue orders its elements using a user-defined priority.
//Queues have a few methods not found in other collection interfaces: peek(), poll(), and offer().
//offer()--> load a priority que
//poll()-->returns the highest priority element, AND removes it from the queue.
//peek()-->returns the highest priority element in the queue without removing it

import java.util.*;
public class Z_22PriorityQueue 
{
	static class PQsort implements Comparator<Integer> 
	{ // inverse sort
		public int compare(Integer one, Integer two)
		{
			return two - one; // unboxing
		}
	}
	public static void main(String[] args)
	{
		int[] ia = {1,5,3,7,6,9,8}; // unordered data

		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); // use natural order

		for(int x : ia) // load queue			//iterates according to highest priority
		{
			pq1.offer(x);		
		}
		System.out.println("Queue is :"+pq1);
		System.out.print("Poll Is : ");

		for(int x : ia) // review queue.
		{
			System.out.print("-- "+pq1.poll() + "-- ");
		}
		System.out.println("");
		System.out.println("Empty  : "+pq1);  //because of polling

		PQsort pqs = new PQsort(); // get a Comparator
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10,pqs); // use Comparator
		for(int x : ia) // load queue					
		{
			pq2.offer(x);
		}
		System.out.println("pq2 using com: "+pq2);

		/*
		 *  This confirms that peek() returns
			the highest priority element in the queue without removing it, and poll() returns
			the highest priority element, AND removes it from the queue.

			the PriorityQueue methods that are important to understand are
			offer() (which is similar to add()), peek() (which retrieves the element at the
			head of the queue, but doesn't delete it), and poll() (which retrieves the head
			element and removes it from the queue).


		 * */
		System.out.println("size " + pq2.size());
		System.out.println("peek " + pq2.peek());
		System.out.println("size " + pq2.size());
		System.out.println("poll " + pq2.poll()); //poll remove the 
		System.out.println("size " + pq2.size());
		for(int x : ia) // review queue
		{
			System.out.print(pq2.poll() + " ");
		}

		System.out.println("");
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");

		String[] sa = {">ff<", "> f<", ">f <", ">FF<" }; // ordered?
		PriorityQueue<String> pq3 = new PriorityQueue<String>();
		for(String s : sa)
			pq3.offer(s);
				
				System.out.print("pq3 : ");
				System.out.print(pq3);
				System.out.println("");
				
				for(String s : sa)
					System.out.print(pq3.peek() + " ");   //peek do not remove the element

						System.out.println("");
						System.out.println("*******************************");

						for(String s : sa)
							System.out.print(pq3.poll() + " ");

	}
}