package OCJPChap7;
//Concept to prove :- If two objects are equal, their hash-code must be equal as well but vice versa is NOT true
//why read below
//NOTE...it is not necessary that two object referring same value ,will give you equality...
//we have to over ride equals method...
//also for same hash-code we have to over ride hash-code method
//NOTE:- over ride equal & hash-code method not overload..pay attention for exam point of view
//Returns a hash-code int value for an object,
// Collections such as HashMap and
//HashSet use the hash-code value of an object to determine how the object should
//be stored in the collection, and the hash-code is used again to help locate the object
//in the collection
/*
 * 		Key 		HashCode Algorithm 					HashCode
 * 		 Alex 		A(1) + L(12) + E(5) + X(24)			= 42
		 Bob		B(2) + O(15) + B(2) 				= 19
		 Dirk		D(4) + I(9) + R(18) + K(11) 		= 42
		 Fred		F(6) + R(18) + E(5) + D(4) 			= 33

		 			HashMap Collection
Hashcode Buckets 	19  		 33     		 42   
                	“Bob” 		“Fred” 			“Alex”
                            					“Dirk”

 * 
 * 
You might have noticed a little flaw in our system, though. Two different names
might result in the same value. For example, the names Amy and May have the same
letters, so the hashcode will be identical for both names. That's acceptable, but
it does mean that when someone asks you (the bucket-clerk) for the Amy piece of
paper, you'll still have to search through the target bucket reading each name until
we find Amy rather than May. The hashcode tells you only which bucket to go into,
but not how to locate the name once we're in that bucket

In real-life hashing, it’s not uncommon to have more than one entry in a
bucket. Hashing retrieval is a two-step process.
1. Find the right bucket (using hashCode())
2. Search the bucket for the right element (using equals() ).

 */

public class _4Hascode
{
	public static void main(String[] args)
	{


	}
}

