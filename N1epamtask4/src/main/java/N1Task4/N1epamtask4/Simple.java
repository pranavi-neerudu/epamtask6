package N1Task4.N1epamtask4;

public class Simple {
	public double calculate(double principal,double time,double interest)
	{
		double simple_interest;
		simple_interest=(principal*time*interest);
		simple_interest=(double)simple_interest/100;
		return simple_interest;
	}
}
