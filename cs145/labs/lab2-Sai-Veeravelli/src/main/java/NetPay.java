import java.util.*;

// this is the main class
public class NetPay {
	// and declare the values of various deduction types
	private static final double FEDERAL_TAX_PERCENT = 10.00;
	private static final double STATE_TAX_PERCENT = 4.50;
	private static final double SS_PERCENT = 6.20;
	private static final double MEDICARE_PERCENT = 1.45;
	private static final double PAY_PER_HOUR = 7.25;

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(true){
			System.out.print("How many hours did you work? ");
			String in = input.next();

			for(int i=0; i < in.length(); i++) {
				if((int)in.charAt(i) < 48 || (int)in.charAt(i) > 57){
					System.out.print("Invalid Input. Please try again \n");
					break;
				}else{
					int numberOfHours = Integer.parseInt(in);
					netPay(numberOfHours);
					return;
				}		
			}
		}
	}

	// the method will calcualte the net pay based ont he hours worked
    public static double netPay(int numberOfHours) {
		double grossValue = numberOfHours * PAY_PER_HOUR;
		double stateTaxValue = grossValue * (STATE_TAX_PERCENT/100.0);
		double fedTaxValue = grossValue * (FEDERAL_TAX_PERCENT/100.0);
		double SSVlaue = grossValue * (SS_PERCENT/100.0);
		double medicareVlaue = grossValue * (MEDICARE_PERCENT/100.0);

		double gross = Math.round(grossValue*100.00)/100.00;
		double stateTax = Math.round(stateTaxValue*100.00)/100.00;
		double fedTax = Math.round(fedTaxValue*100.00)/100.00;
		double SS = Math.round(SSVlaue*100.00)/100.00;
		double medicare = Math.round(medicareVlaue*100.00)/100.00;


		double netTemp = gross - (stateTax +fedTax +SS +medicare);

		double net = Math.round(netTemp*100.0)/100.0;

		System.out.print("Hours per week: " + numberOfHours + "\n");
		System.out.printf("Gross pay: %.2f \n\n", grossValue);
		System.out.println("Deductions");
		System.out.printf("Federal: %.2f \n",fedTaxValue);
		System.out.printf("State: %.2f \n", stateTaxValue);
		System.out.printf("Social Security: %.2f \n", SSVlaue);
		System.out.printf("Medicare: %.2f \n\n", medicareVlaue);

		System.out.printf("NetPay: %.2f \n", net);

    	return net;
	}
	

}
