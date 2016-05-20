package OCJPChap3;

import java.util.Date;

import HiHa.hashcodes;

public class GarbageCollector {

	GarbageCollector g1;

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		// The StringBuffer object is not eligible for collection
		sb = null;
		// Now the StringBuffer object is eligible for collection
		//System.out.println(sb.hashCode());
		StringBuffer s1 = new StringBuffer("hello");
		StringBuffer s2 = new StringBuffer("goodbye");
		System.out.println("Diff : "+s1.hashCode());
		System.out.println("Diff : "+s2.hashCode());
		// At this point the StringBuffer "hello" is not eligible
		s1 = s2; // Redirects s1 to refer to the "goodbye" object
		// Now the StringBuffer "hello" is eligible for collection
		System.out.println("same : "+s1.hashCode());
		System.out.println("same : "+s2.hashCode());

		/*
		 * 
		 * Objects that are created in a method also need to be considered. When a method
				is invoked, any local variables created exist only for the duration of the method.
				Once the method has returned, the objects created in the method are eligible for
				garbage collection. There is an obvious exception, however. If an object is returned
				from the method, its reference might be assigned to a reference variable in the
				method that called it; hence, it will not be eligible for collection*/

		Date d = getDate();
		//doComplicatedStuff();
		System.out.println("d = " + d);


		/*
		 * 
		 *	we created a method called getDate() that returns a
				Date object. This method creates two objects: a Date and a StringBuffer containing
				the date information. Since the method returns the Date object, it will not be
				eligible for collection even after the method has completed. The StringBuffer object,
				though, will be eligible, even though we didn't explicitly set the now variable to null 
		 * 
		 */







		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());

		System.out.println("Before Memory = " + rt.freeMemory());
		Date d1 = null;
		for(int i = 0;i<10000;i++)
		{
			d1 = new Date();
			d1 = null;
		}
		System.out.println("After Memory =  "+ rt.freeMemory());
		rt.gc(); // an alternate to System.gc()
		System.out.println("After GC Memory = "  + rt.freeMemory());


		GarbageCollector g2= new GarbageCollector();	 

		GarbageCollector g3= new GarbageCollector();

		GarbageCollector g4= new GarbageCollector();	

		Runtime rt1 = Runtime.getRuntime();
		System.out.println(" ");
		System.out.println("Total JVM memory1: " + rt1.totalMemory());

		g2.g1=g3;
		g3.g1=g4;
		g4.g1=g2;
		
		g2=null;
		//g3 & g4 are referring each other
		System.out.println(g3.hashCode());
		System.out.println(g4.hashCode());
		g3=null;
		System.out.println(g4.hashCode());
		g4=null;
	//	System.out.println(g4.hashCode());
		//NOw all are eligible for garbage collection...
		//no change in free memory even if u cmnt or not cmnt g4
		//after memory & after gc mem always give same value


		//Cleaning Up Before Garbage Collection—the finalize() Method

	}




	public static Date getDate() {
		Date d2 = new Date();
		StringBuffer now = new StringBuffer(d2.toString());
		System.out.println(now);
		return d2;
	}
}
