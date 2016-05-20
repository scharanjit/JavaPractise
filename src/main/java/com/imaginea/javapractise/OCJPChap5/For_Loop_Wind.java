package OCJPChap5;

public class For_Loop_Wind {
	public static void main(String[] args) {
		foreach:
			for(int j=0; j<5; j++) 
			{
				for(int k=0; k< 3; k++)
				{
					System.out.print(" " + j);
					if(j==3 && k==1) break foreach;
					if(j==0 || j==2) break;
				}
			}
	}
}

/*A break breaks out of the current innermost loop and continues. A labeled
break breaks out of and terminates the current loops.*/