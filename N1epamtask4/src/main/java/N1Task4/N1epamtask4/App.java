package N1Task4.N1epamtask4;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Enter amount to calculate simple and compound intereset");
    	Scanner sc=new Scanner(System.in);
    	double principal=sc.nextDouble();
    	System.out.println("Enter time period in terms of years");
    	double timeperiod=sc.nextDouble();
    	System.out.println("Enter rate of interest in terms of percentage");
    	double rate_of_interest=sc.nextDouble();
    	
    	if(rate_of_interest>100||rate_of_interest<0)
    		System.out.println("Please enter an accurate amount");
    		
    	else {
    	
    	Simple simple=new Simple();
    	System.out.println("Simple interest is: "+simple.calculate(principal,timeperiod,rate_of_interest));
    	Compound compound=new Compound();
    	System.out.println("Compound interest is: "+compound.calculate(principal,timeperiod,rate_of_interest));
    	
    	}
    }
    
}
