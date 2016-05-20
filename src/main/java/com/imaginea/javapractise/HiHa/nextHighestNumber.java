package HiHa;
//next highest but digit should be same
//convert integer to string to char array
//compare last two digits...ifl>l-1 then ok unless compare l-1 & l-2
//replace characts based upon above condition

//output two for loos is from 0 to pivot index
//2nd loop from len -1 to >pivot index


public class nextHighestNumber {
	public static void main(String[] args) {
		
	String output="";
	int val=12343;
	char arr[]= Integer.toString(val).toCharArray();
	
	int len= arr.length;
	System.out.println("length of integer is:"+len);
	int min=99999999;
			int pivotindex=-1; 
			int replaceindex=-1;

			for(int i=len-1;i>=0;i--)
			{
				//i=4
				//i=3
				if(i==0)
				{
					break;//checking single digit
				}	
				if(arr[i-1]<arr[i] && i>0)
				{
				pivotindex=i-1;
				//p=3
				//p=2
				for(int  j = pivotindex+1 ;j<len;j++)
				{
					//j=4
					//j=3
					int d= arr[j]-arr[pivotindex];
					//d=1
					
					if(d<min && d>0){
						
								replaceindex=j;
								min=d;
				}
					//r=4
					//min=1
					
					//r=3
					//min=1
				}
				
				char temp= arr[pivotindex];
				arr[pivotindex]=arr[replaceindex];
				arr[replaceindex]=temp;
				
				System.out.println(arr[replaceindex]);
				System.out.println(arr[pivotindex]);
				//last two digits replaced
				
				for(i=0;i<=pivotindex;i++)	
					output += arr[i];
				
				System.out.println(output);
				for(i=len-1; i>pivotindex;i--)
				    output+=arr[i];
				System.out.println(output);
				
					break;	
				}
				}
				if(pivotindex==-1)
					System.out.println("output :" +val);
				else
					System.out.println("output :" +output);
					
				}
			

			
			
	}	

