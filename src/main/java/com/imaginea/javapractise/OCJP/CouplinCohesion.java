package OCJP;


// Coupling how much class B know about class A...if very less...then loose coupling & dats good
// if some part of class A depends upon some interface o class B...its tightly coupled...& dats bad actually

//----------------------------------------------------------------------------
//COHESION:- its all about a single class
//how a class is designed so that it does not depends upon other class &
//class has a single, well-focused purpose.

public class CouplinCohesion {

}

class DoTaxes {
	float rate;

	float doColorado() 
	{
		SalesTaxRates str = new SalesTaxRates();
		rate = str.salesRate; // ouch
		// this should be a method call:
		// rate = str.getSalesRate("CO");
		// do stuff with rate
		return rate;
	}
}

class SalesTaxRates 
{
	public float salesRate; // should be private
	public float adjustedSalesRate; // should be private
	public float getSalesRate(String region) {
		salesRate = new DoTaxes().doColorado(); // ouch again!
		// do region-based calculations
		return adjustedSalesRate;
	}
}


//Cohesion example


class BudgetReport {
	void connectToRDBMS(){ }
	void generateBudgetReport() { }
	void saveToFile() { }
	void print() { }
}


// this is better...good cohesion
/*class BudgetReport {
		Options getReportingOptions() { }
		void generateBudgetReport(Options o) { }
		}
		class ConnectToRDBMS {
		DBconnection getRDBMS() { }
		}
		class PrintStuff {
		PrintOptions getPrintOptions() { }
		}
		class FileSaver {
		SaveOptions getFileSaveOptions() { }
		}
 */