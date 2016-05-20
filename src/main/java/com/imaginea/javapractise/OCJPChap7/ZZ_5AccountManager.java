package OCJPChap7;

import java.util.*;
//This class is to be updated to make use of appropriate generic types, with no changes in behavior

public class ZZ_5AccountManager {
	
	//private Map accountTotals = new HashMap();
	private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
	
	private int retirementFund;

 	public int getBalance(String accountName)
 	{
	 /* Integer total = (Integer) accountTotals.get(accountName);
	  if (total == null)
		  total = Integer.valueOf(0);
	  	return total.intValue();*/
 		Integer total = accountTotals.get(accountName);
 		if (total == null) total = 0;
 		return total;
 	}
 	
 	
 public void setBalance(String accountName, int amount) 
 {
	// accountTotals.put(accountName, Integer.valueOf(amount));
	 
	 accountTotals.put(accountName, amount);
 }
 
}