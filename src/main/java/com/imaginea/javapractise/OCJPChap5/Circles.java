package OCJPChap5;

public class Circles {
	public static void main(String[] args) {
		int[] ia = {1,3,5,7,9};
		for(int x : ia)
		{
			for(int j = 0; j < 3; j++) 
			{
				if(x > 4 && x < 8) continue;
				System.out.print(" " + x);
				if(j == 1) break;
				continue;
			}
			continue;
		}
	}
}

/*The basic rule for unlabeled continue statements is that the current iteration
 stops early and execution jumps to the next iteration. The last two continue statements are
 redundant!

 */