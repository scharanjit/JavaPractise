package OCJPChap9;
/*
 * The methods wait() , notify(), and notifyAll() are methods of only
java.lang.Object, not of java.lang.Thread or java.lang.Runnable.
 * */

import java.util.ArrayList;
import java.util.List;

	class Operator extends Thread 
	{
		T_18Machine machine; // assume this gets initialized
			public void run()
			{
				while (true) 
				{
					Shape shape = getShapeFromUser();
					MachineInstructions job =calculateNewInstructionsFor(shape);
					machine.addJob(job);
				}
			}
			private MachineInstructions calculateNewInstructionsFor(Shape shape) 
			{
				// TODO Auto-generated method stub
				return null;
			}
			private Shape getShapeFromUser() 
			{
				// TODO Auto-generated method stub
				return null;
			}
	}

public class T_18Machine extends Thread 
{
	List<MachineInstructions> jobs =new ArrayList<MachineInstructions>();
	public void addJob(MachineInstructions job) 
	{
		synchronized (jobs)
		{
			jobs.add(job);
			jobs.notify();
		}
	}
	public void run()
	{
		while (true)
		{
			synchronized (jobs) 
			{
				// wait until at least one job is available
				while (jobs.isEmpty()) 
				{
					try
					{
						jobs.wait();
					} 
					catch (InterruptedException ie)
					{ }
				}
				// If we get here, we know that jobs is not empty
				MachineInstructions instructions = jobs.remove(0);
				// Send machine steps to hardware
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}