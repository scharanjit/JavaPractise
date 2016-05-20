package HiHa;

//the array was sorted...so the array wud be 2,7,32,48,55....we made it round,,,2 is pivot element
//find pivot element in rounded array

public class arrayroundsortedpivotprob {
	public static void main(String[] args) {
		
		int array[]={32,48,55,64,2,8,9,10};
		int left = 0;
		int right = array.length - 1;
		while (array[left] > array[right])
		{
		    int mid = left + (right-left) / 2;  //complexity of solution:-->this is O(log2n) terminology..there are so many terminologies O(logn)..O(n).worst case annalysis..binary search)
		    if(array[mid] > array[right])
		    {
		        left = mid + 1;
		    }
		    else
		    {
		        right = mid;
		    }
		}
		System.out.println(left);
	}

}
