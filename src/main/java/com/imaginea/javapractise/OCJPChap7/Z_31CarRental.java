package OCJPChap7;

import java.util.*;
public class Z_31CarRental extends Z_30Rental 
{
	
	
	public Z_31CarRental(int maxNum, List<Car1> rentalPool)
	{
		super(maxNum, rentalPool);
	}
	public Car1 getRental() 
	{
		return (Car1) super.getRental();
	}

	public void returnRental(Car1 c)
	{
		super.returnRental(c);
	}
	public void returnRental(Object o) 
	{
		if (o instanceof Car1) {
			super.returnRental(o);
		}
		else
		{
			System.out.println("Cannot add a non-Car");
			// probably throw an exception
		}
	}
}

