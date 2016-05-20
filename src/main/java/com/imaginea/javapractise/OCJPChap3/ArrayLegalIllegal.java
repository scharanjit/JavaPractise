package OCJPChap3;

public class ArrayLegalIllegal {

	public static void main(String[] args) {

		char[] splits;
		int []dates = new int[100];
		int [] mila; 
                String []adad = new String[21];
		//splits=mila;  
		mila = dates;

		//It's tempting to assume that because a variable of type byte, short, or char
		//can be explicitly promoted and assigned to an int, an array of any of those types
		//could be assigned to an int array

		Honda[] h = new Honda[100];
		car[] c;

		c=h; //LEGAL
		//	h=c; //illegal
		// a parent can refer hi child but child CANT refer his/her parent
		Beer[] b = new Beer[20];
		//b=c; illegal



		int[] blots;
		int [] cloat= {5};
		int[][] squeegees = new int[3][];
		//blots = squeegees; // NOT OK, squeegees is a
		squeegees[0]=cloat;
		
		// two-d array of int arrays



		//Pay particular attention to array assignments using different dimensions. You
		//might, for example, be asked if it's legal to assign an int array to the first element in
		//an array of int arrays, as follows:
		
		int[][] books = new int[3][];
		int[] numbers = new int[6];
		int aNumber = 7;
		
		//books[0] = aNumber; // NO, expecting an int array not an int
		books[0][0] = aNumber; 
		books[0] = numbers; // OK, numbers is an int array
	}

}



class car{}

class Honda extends car 
{

}

class Beer
{}