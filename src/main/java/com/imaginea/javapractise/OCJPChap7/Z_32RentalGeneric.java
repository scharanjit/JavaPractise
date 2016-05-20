package OCJPChap7;

import java.util.*;
public class Z_32RentalGeneric<T>
{ 									// "T" is for the type
	// parameter
	private List<T> rentalPool; // Use the class type for the
	// List type
	private int maxNum;
	public Z_32RentalGeneric(int maxNum, List<T> rentalPool)
	{ // constructor takes a
		// List of the class type
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}

	public T getRental()
	{ // we rent out a T
		// blocks until there's something available
		return rentalPool.get(0);
	}
	public void returnRental(T returnedThing)
	{ // and the renter
		// returns a T
		rentalPool.add(returnedThing);
	}


	public static void main (String[] args) {
		//make some Cars for the pool
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		List<Car1> carList = new ArrayList<Car1>();
		carList.add(c1);
		carList.add(c2);
		Z_32RentalGeneric<Car1> carRental = new Z_32RentalGeneric<Car1>(2, carList);
		// now get a car out, and it won't need a cast
		Car1 carToRent = carRental.getRental();
		carRental.returnRental(carToRent);
		// can we stick something else in the original carList?
		//carList.add(new Cat("Fluffy"));
	}
}