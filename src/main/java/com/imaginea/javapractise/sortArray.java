import java.util.Arrays;

public class sortArray {
	public static void main(String[] args) {        
        //Without using Arrays.sort function
        int i;
        
        int a[] = new int[500];
        
        for (int c=1;c<10; c++)
        {
        	a[c]=c;
        }
        
        for(int g=0;g<a.length; g++)
        {
        	System.out.println(+a[g]);
        }
        int nos[] = {120,9,-4,1,-3,10,34,12,-1100};
        System.out.print("Values before sorting: \n");
        for(i = 0; i < nos.length; i++)
            System.out.println( nos[i]+"  ");               
        sort(nos, nos.length);
        System.out.print("Values after sorting: \n");       
        for(i = 0; i <nos.length; i++){
            System.out.print(nos[i]+"  ");
        }
    }

    public static void sort(int nos[], int n) {
     for (int i = 1; i < n; i++)
     {
          int j = i;
          int B = nos[i];
          while ((j > 0) && (nos[j-1] > B))
          {
            nos[j] = nos[j-1];
            j--;
          }
          nos[j] = B;
        }
    }
} 

