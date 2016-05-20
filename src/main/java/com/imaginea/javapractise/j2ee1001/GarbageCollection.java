package j2ee1001;
//finally ahshcode scenario
public class GarbageCollection {
	public static void main(String args[]) {
		GarbageCollection a1 = new GarbageCollection();
		GarbageCollection a2 = new GarbageCollection();
		
		System.out.println("a1 : "+a1.hashCode());
		System.out.println("a2 : "+a2.hashCode());
		
		
	GarbageCollection a3 = a2;
System.out.println(a3.hashCode());
		a2 = a1;
		System.out.println("new a2 : "+a2.hashCode());
		System.out.println(a2.getClass());
		GarbageCollection a4 = a2;
		System.out.println("a4 :"+a4.hashCode());
		
	
		a1 = null;
		//--after this line we destroy a1 refernc..but hashcode of refercne a1...still uses by a2 & a4
		//so no object availbel for GC
		System.out.println("final a2 :"+a2.hashCode());
		//System.out.println(a1.hashCode());
		System.out.println("a3 :"+a3.hashCode());
		System.out.println("a4 :"+a4.hashCode());
	
		//Stmt7
	}
}

/*
 * Guru Mantar of GC
 * 
 * ref a1--> obj 1
 * ref a2-->obj 2
 * ref a3--> obj 2
 * ref a2--> obj1
 * 
 * ref a4-->obj1
 * 
 * ref a1-->null
 * 
 * 
 * */



