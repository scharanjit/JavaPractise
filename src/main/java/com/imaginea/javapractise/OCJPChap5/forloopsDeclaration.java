package OCJPChap5;

public class forloopsDeclaration {

	
	
	public static void main(String[] args) {
		
		
		// for (/*Initialization*/ ; /*Condition*/ ; /* Iteration */) 
		 //{
			/* loop body */
		//	}
	
		
		for (int x = 10, y = 3; y > 3; y++)
		
		{ 
			
			
		}
		
		//System.out.println(x);  //compilatiuon error...local var
		
		forloopsDeclaration f1 = new forloopsDeclaration();
		f1.doStuff();
		
		
		
		
	//break--> Execution jumps immediately to the 1st statement after the for loop.
	//return--> Execution jumps immediately back to the calling method.
	//System.exit(0)--> All program execution stops; the JVM shuts down.
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		
		int i = 0;
		for (;i<10;) {
		i++;
		System.out.println("-i- : "+i);
		}
		
		
		int xf = 3;
		for (xf = 12; xf < 20; xf++) { }
		System.out.println(xf);
		
		
		for (int x2 = 3; x2 < 20; x2++)
		{ }
		//System.out.println(x2); //scope problem
		
		
		System.out.println("-------------------------------------------------------------------");
		
		
		int b = 3;
		for (/*1*/int a = 1; /*2*/ b != 1; /*4*/ System.out.println("iterate")) 
		{
			/*3*/
		b = b - a;
		}
		
		System.out.println("");
		System.out.println("---------------------------------------------------------");
		System.out.println(" ");
		
		
		int [] a = {1,2,3,4};
		for(int x = 0; x < a.length; x++) // basic for loop
		System.out.print(a[x]);
		
		//for(declaration : expression)
		
		for(int n : a) // enhanced for loop
		System.out.print(n);
		
	//legal ARRAY FOR LOOP
				
				
				int x;
				long x2;
				Long [] La = {4L, 5L, 6L};
				long [] la = {7L, 8L, 9L};
				int [][] twoDee = {{1,2,3}, {4,5,6}, {7,8,9}};
				String [] sNums = {"one", "two", "three"};
				Animal [] animals = {new Dog(), new Cat()};
				// legal 'for' declarations
				for(long y : la ) ; // loop thru an array of longs
				for(long lp : La) ; // autoboxing the Long objects
				// into longs
				for(int[] n : twoDee) ; // loop thru the array of arrays
				for(int n2 : twoDee[2]) ; // loop thru the 3rd sub-array
				for(String s : sNums) ; // loop thru the array of Strings
				for(Object o : sNums) ; // set an Object reference to
				// each String
				for(Animal a1 : animals) ; // set an Animal reference
		
		
						
						// ILLEGAL 'for' declarations
				//		for(x2 : la) ; // x2 is already declared
						for(long xm : la);     //for(declaration : expression)
								
				//		for(int x2 : twoDee) ; // can't stuff an array into an int
						// closely watch
						//twoDee is 2D array :O
						for(int x3[] : twoDee) ;
						
						
						
				//		for(int x3 : la) ; // can't stuff a long into an int
								for (long x3 : la);
				//	for(Dog d : animals) ; // you might get a Cat!
			    //Dog & cat are children of class animal	
				// How can chilod refer/points to his/her parent
				//Only parents can refer their children/old rule
										
										
										System.out.println("");
										
										System.out.println("--------------------------------------------------------");

										
			//Break  & Continue
									
			//The break and continue keywords are used to stop either the entire loop
			//(break) or just the current iteration (continue).
			//Remember, continue statements must be inside a loop; otherwise,
			//you’ll get a compiler error. break statements must be used inside either a loop or
			//switch statement.							
								
										
						for (int i1 = 0; i1 < 10; i1++)
						{
							int m=0;
							System.out.println("Inside loop : "+i1);
							continue;
						}
						System.out.println("******************************************************");
						System.out.println("******************************************************");
						System.out.println("******************************************************");
						System.out.println("******************************************************");
							
						forloopsDeclaration foo = new forloopsDeclaration();
						
						
						for (int i1 = 0; i1 < 10; i1++) {
							System.out.println("Inside loop foo "+i1);
							if (foo.doStuff1() == 5) {   //change the return value of function to 5
							continue;
							}
							// more loop code, that won't be reached when the above if
							// test is true
							
							System.out.println("i1 : "+i1);
							}
										
										
										
						boolean problem = true;
						while (true) 
						{
						if (problem) 
							{
								System.out.println("There was a problem-->break example : "+problem);
								break;
							}
						}
						
						System.out.println("standby");
						
						
						
						
						
						
						
		
	}
	
	
	
	
	
	
	
	
	
	private int doStuff1() {
		// TODO Auto-generated method stub
		return 5;
	}

	static boolean doStuff() {
		for (int x = 0; x < 100; x++) {
		System.out.println("in for loop");
		return true;									//The statement only prints once, because a return causes execution to leave not just
		}												//the current iteration of a loop, but the entire method. So the iteration expression
														//never runs in that case.
		//return true;
		return false;
		}
}
