package MockSCJP;

import j2ee1001.GarbageCollection;

public 	class S3_Array {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4};
		call_array(arr[0], arr);
		System.out.println(arr[0] + "," + arr[1]+","+arr[2]); 
		
		call();
		
		shotckt();
		shotckt1();
		exception();
		

	}
	private static int exception() {
try {
	return 8;
	
	//return exception();
} catch (Exception e) {
	return 5;
	//return exception();
}
finally
{
	//return exception();
	
	}
		
	}
	private static void shotckt1() {
		int i = 0;
			boolean t = true;
		boolean f = false, b;
				b = (t & ((i++) == 0));
				b = (f & ((i+=2) > 0));
					System.out.println("SHOT CKT 1-->"+i);	

		
	}
	private static void shotckt() {
		int i = 0;
			boolean t = true;
			boolean f = false, b;
			//and is 1 1 --> else zero.... ...so using &--> chk both..even first fails...&&--. chk first only..success..then second
		b = (t && ((i++) == 0));
		b = (f && ((i+=2) > 0));
		System.out.println("Shot Ckt :------> "+i);	  // i shud be 2 here :O

		
	}
	private static void call() {
		int i,j,k,l=0;
			k = l++;
			j = ++k;
			i = j++;
			System.out.println("call method  -->"+i);	

		
	}
	static void call_array(int i, int arr[]) {
		arr[i] = 6;
		i = 5;
	}    
}
