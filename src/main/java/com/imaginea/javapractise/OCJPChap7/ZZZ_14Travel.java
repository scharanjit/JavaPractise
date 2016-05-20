package OCJPChap7;

import java.util.*;
class Business { }
class Hotel extends Business { }
class Inn extends Hotel { }
public class ZZZ_14Travel {
	ArrayList<Hotel> go() {
		// insert code here
		return new ArrayList<Hotel>();
	}
}

/*Which, inserted independently at line 9, will compile? (Choose all that apply.)
 A. return new ArrayList<Inn>();
 B. return new ArrayList<Hotel>();
 C. return new ArrayList<Object>();
 D. return new ArrayList<Business>();

 B is correct.
A is incorrect because polymorphic assignments don't apply to generic type parameters. C
and D are incorrect because they don't follow basic polymorphism rules. (Objective 6.4)*/