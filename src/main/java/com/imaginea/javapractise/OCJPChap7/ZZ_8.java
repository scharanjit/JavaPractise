package OCJPChap7;

import java.util.*;

public class ZZ_8 {
	
	public static <E extends Number> List<E> process(List<E> nums){
	//A programmer wants to use this method like this
	// INSERT DECLARATIONS HERE
		
		ArrayList<Integer> input = null;
		List<Integer> output = null;
	output = process(input);
	return nums;
	}
}



/*
 * 
 * A. ArrayList<Integer> input = null;
ArrayList<Integer> output = null;
B. ArrayList<Integer> input = null;
List<Integer> output = null;
C. ArrayList<Integer> input = null;
List<Number> output = null;
D. List<Number> input = null;
ArrayList<Integer> output = null;
E. List<Number> input = null;
List<Number> output = null;
F. List<Integer> input = null;
List<Integer> output = null;
 * 
 * 
 * B, E, and F are correct.
 * The return type of process is definitely declared as a List, not an ArrayList, so A and D
are wrong. C is wrong because the return type evaluates to List<Integer>, and that can't
be assigned to a variable of type List<Number>. Of course all these would probably cause a
NullPointerException since the variables are still null—but the question only asked us
to get the code to compile. (Objective 6.4)
 * 
 * */
 