package OCJPChap7;

public class pointsToRemember {

}
/*
 
 1.) Autoboxing relation with Java Collections
 2.) overridung of toString,.equals & hashcode() methods & their effect on o/p  ..Applee1.java
 3.)Collection(List,Set,Map(4types),Queues
 
 4.) == means ...refernce equal			...DiffBwequalequal.java
 .equal means meaningfully equal
 
 5 == 5.0f bec they refer to same object
 but 5 is not meaningfully equal to 5.0f..both have dif meanisn
 .equal cannt use on primitive
 
 5.) Old concept...child cannot(bec parent may contain diff types...child can refer his types only) refer his parents...
 it can if we do type casting.... :O :O: O..ParentChildren.java...but still it will give run time error
 
 6.) use of interface implements Compariable<ClassType>
 ...it is necessary for error free implementation...as in tree set
 
 8.) If we converting array into a list ....
Arrays.asList(arrayRefernce)..  //array to list
Suppose we made any change inside array..it will automatically populate inside list.
listRef.toList(ArrayRef);  //list to array

9.)List=1/set
List= ordered but duplicates
set may be(Tree set-->natural ascending order sort) or may not be ordered(hashset) but no duplicates...
we can add...but they wnt get saved

10.) Override the hashCode() and equals() methods...when using Map & its key concept fetching data
Tree Map is sorted...rest all (HashMap,Linked hashmap & Hashtable) are unsorted
m.put(key,value);
m.get(key);
if we have hascode overriden...duplicates not saved...if we dnt have..den alllwed...
anyway...no excedption


11.) Jha Tree aa gya...bole to auto sort(so duplicates)..but duplicates if aadded.
.it will compile...but show error at runtime
Tree set has subset,tail set last first ceiling functions

12.) Map has submap..which describes the range...Z_21BackedCollections.java
	submap = map.subMap("keyrange1", "keyrange2");
	//we can add data in b/w these two keys in submap
	 Watever falls in this range ..automatically copies in submap...
	 if out of range..den only available in map


 13.) one shud know generic non generic collections ...Z_23GenericNonGenericCollection.java
 Question on casting required with non generic collections
 Advantage of generic:- Casting not required.
 List test = new ArrayList();
		test.add(43);
		int x = (Integer)test.get(0); // you must cast !!
		List<Integer> test2 = new ArrayList<Integer>();
		test2.add(343);
		int x2 = test2.get(0); // cast not necessary
 
 .14.) Priority Queue...-> Offer, Poll (High Prority With removal),Peek (HP with removal)
 offer--> add data into queue... offer(arrayname) with for loop
 
 15.) NO Polymeorphism allowed  in generics
 Collection disadvantage 
 Z_27AnimalDoctor.java
 but arrays it can
though we can add objects..but no refernce


16.) <?> wildacard-->allows a list of ANY type to be passed to the method
--> Do not use wildcar in object creeation
List<?> foo = new ArrayList<? extends Animall>();-->ERROR
--> wildcard extends/super subclass cannot refer wrapper classes
List<? extends Doggg> cList = new ArrayList<Integer>();-->ERROR
-->Using wildcard polymorphism allowed
?extends Parent refers child object
?super child refers Parent Object
vice versa NOT allowed
 
 
 All classes implementing the Comparable interface must implement the 
compareTo() method that has the return
  type as an integer. The signature of the compareTo() method is as follows:

      int i = object1.compareTo(object2)
If object1 < object2: The value of i returned will be negative.
If object1 > object2: The value of i returned will be positive.
If object1 = object2: The value of i returned will be zero.
 
 */
