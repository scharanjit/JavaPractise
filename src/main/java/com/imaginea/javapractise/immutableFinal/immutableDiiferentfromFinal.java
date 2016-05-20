package immutableFinal;

public class immutableDiiferentfromFinal {
	
	public static void main(String[] args) {
		final String str ="No Can change Me";
		//str="Hi";
		
		//str=str.replace("N", "o");
		
		
		String immutabelStr="Immutable";
		
		immutabelStr= immutabelStr.replaceAll("I", "b");
		System.out.println(immutabelStr);
		
		//actually here it is poitning to new object
	}

}
