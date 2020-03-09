package N1Task4.N1epamtask4;

public class Compound {
	public double calculate(double principle, double time, double rate) {
	    double amount = principle * (Math.pow((1 + rate / 100), time));
	    double compoundinterest = amount - principle;
	    return compoundinterest;
	   }
}
