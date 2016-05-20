package HiHa;

public class OhNoMutable extends ImSoImmutable {   
	 public int field3 = 0;

	 public OhNoMutable(int field1, int field2)    {
	    super(field1, field2);          
	 }

	 public int add(){
	 return super.add()+field3;  
	 }
	 
}
	 