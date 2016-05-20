package pRACTISE;

public class BinarySearch {
	public static void main(String[] args) {
		int element=9;
		int [] array= {1,2,3,4,5,6};
		binaryAlgo(element,array);
	}

	private static void binaryAlgo(int element, int[] array) {
		
		
		int first=0;
		int last=array.length-1;
		int midle=(first+last)/2;
		
		while(first<=last)
		{
			if(element>array[midle])
			{
				first=midle+1;
			}
			
			else if (array[midle]==element)
			{
				
				System.out.println( "the o/p index "+(midle+1));
				break;
			}
			
			else
			{
				last=midle-1;
			}
			
			
			midle=(first+last)/2;
		}
		
		if(first>last)
		{
			System.out.println("NOT FOUND");
		}
		
	}

}
