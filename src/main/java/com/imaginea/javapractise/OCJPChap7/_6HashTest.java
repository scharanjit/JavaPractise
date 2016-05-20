package OCJPChap7;
 
//Without overriding

public class _6HashTest {
	public static void main(String[] args) {
		_6HashTest x = new _6HashTest();
		_6HashTest y = new _6HashTest();
		
		System.out.println(x.equals(y));
		System.out.println(x.hashCode()==y.hashCode());
		
		
		Integer i= new Integer(42);
		Integer i1= new Integer(42);
		
		if(i.equals(i1))
		{System.out.println("YAHOO");}
		if(i==i1)
		{
			System.out.println("Yahoo again");
		}
		if(i.hashCode()==i1.hashCode())
		{System.out.println("MIhauuu");}
		
		/*RULE OF HASHCODE
		 *
		 * 
		 * 
		Condition 							Required 								Not Required (But Allowed)
		x.equals(y) == true 				x.hashCode() ==y.hashCode()	{if we are not overrising .equals method as in _3EqualsTest//return false in both cases}			------
		x.hashCode() ==y.hashCode()			----									x.equals(y) == true
		x.equals(y) == false				----									No hashCode() requirements
		x.hashCode() !=y.hashCode()			x.equals(y) == false					-----
		 * 
		 * */
		 
	}

}
