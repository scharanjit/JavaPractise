import java.util.Scanner;


public class arrSorting {
	public static void main(String[] args) {
		int arr[]={10,-5,11,6};
		sort(arr,arr.length);
		
		for(int a=0;a<arr.length; a++)
		{
			System.out.println(+arr[a]);
		}
		
	System.out.println("Enter the number u want to search");	
		//binary search
		Scanner scan= new Scanner(System.in);
		
		int find= scan.nextInt();
		int mid=arr.length/2;
		
		for(int i=0;i<arr.length;i++)
		{
			if(find==arr[i])
			{
				System.out.println("the index of element is "+i );
			}
		}
		
	}

	private static void sort(int[] arr, int length) {
		
		for(int i=1; i<length; i++)
		{
			int j=i;
			int val= arr[i];
			while((j>0) && (arr[j-1]> val))
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=val;
			//System.out.println(+arr[j]);
		}
	}

}
