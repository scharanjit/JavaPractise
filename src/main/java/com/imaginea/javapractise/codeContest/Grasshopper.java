package codeContest;
import java.util.Scanner;

/*
find the number of such starting position(x,y), which have the maximum possible value of dx,y
	

There is a Grasshopper in a tropical forest.
 The grasshopper can jump only vertically and horizontally, and the length of jump is always equal to x centimeter. 
 A GRasshopper has found herself at the center of some cell of the chess board of the size pxq centimeters
 (each cell is 1x1 centimeters).
  She can jump as she wishes for an arbitrary number of times, 
  she can even visit a cell more than once. the only restriction is that she cannot jump out of the board.
 
The grasshopper can count the number of cells that she can reach from the starting position(x,y). 
Let's denote this amount by dx,y. your task is to find the number of such starting position(x,y), 
which have the maximum possible value of dx,y
 
Input
 
The integer array contains three integers p,q,x
 
p= length of the board
q= width of the board
 
x=length of the grasshoppers jump.
 
Output
 
Output the only integer - the number of the required starting position of the GRasshopper
 
Example
 
input 2 3 1000000
output 6
 
input 3 3 2
output 4
*/



public class Grasshopper {

	public static void main(String[] args) throws Exception {
		
		int a[] = new int[3];
		int i=0;
		Scanner sc = new Scanner(System.in);
	//	int b=sc.nextInt();
		//System.out.println(b);
		
		System.out.println("Enter lenght of the board, width & grahopper lenght");
		while(sc.hasNext() && i<2)
		{
			a[i]=sc.nextInt();
			i=i+1;
		}
		
		
		
		
		
		System.out.println(squareCount(a));
	}
	
	public static int squareCount(int[] input1)
    {
        int return_result;
        
       // System.out.println(input1[0]+" "+input1[1]+" "+input1[2]);
       // System.out.println(input1[0] - 0.5);
        //System.out.println("x: "+x);
        
        
        if (((input1[0] - 0.5) >= input1[2]) && ((input1[1] - 0.5) >= input1[2]))
        {
            return_result = 4;
        }
        else if ((((input1[0] - 0.5) >= input1[2]) && ((input1[1] - 0.5) < input1[2])) || (((input1[0] - 0.5) < input1[2]) && ((input1[1] - 0.5) >= input1[2])))
        {
            return_result = 2;
        }
        else
        {
            return_result = input1[0] * input1[1];
        }
        return return_result;
    }
}
