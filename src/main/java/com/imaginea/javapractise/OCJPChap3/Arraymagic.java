package OCJPChap3;

public class Arraymagic {

	//int[] carList = new int[]; // Will not compile; needs a size
	static String year[] = new String[500]; 
        static int arr[] = new int[500];


	int[][] scores = new int[3][] ;
	// Declare and create an array holding three references
	// to int arrays
	{
		scores[0] = new int[4];
		// the first element in the scores array is an int array
		// of four int elements
		scores[1] = new int[6];
		// the second element in the scores array is an int array
		// of six int elements
		scores[2] = new int[1];
		// the third element in the scores array is an int array
		// of one int element
	}
	


	public static void main(String[] args) {
		for (int i =0 ;i<500;i++)
		{
			System.out.print(year[i]+" ");
                        System.out.print(arr[i]+" ");
		}



	}


}
