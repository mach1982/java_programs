public class JFT4Ex3{
	
	public static void main(String[] args){
	
	String employeeName="Brain Hayes";
	final String ppsNo="8494514D";
	String departmnet ="IT";
	double hoursBasic=50.5;
	double hoursOT=13.5;
	double basicPay=29.35;
	double otPay=(basicPay*1.5)*hoursOT;
	double taxRate=0.35;
	double grossPay =(basicPay*hoursBasic)+otPay;
	double tax = grossPay*taxRate;
	double netPay =grossPay-tax;
	
	
	
	System.out.print("**********Salary Report********\n");
	
	
	System.out.print("**********Salary Employee Details********\n");
	System.out.println("Employee Name:"+ employeeName);
	System.out.println("Employee PPS No: " +ppsNo);
	System.out.println("Departmnet: "+ departmnet);
	System.out.print("\n");
	
	System.out.print("**********Hours Worked********\n");
	System.out.println("No of basic hours worked:"+ hoursBasic);
	System.out.println("The hourly rate of basic pay is at" +basicPay +"euro.");
	System.out.println("No of overtime hours worked : "+ hoursOT);
	System.out.println("Hourly rate of over time is at time and half: ");
	System.out.println("Overtime Salary: "+ otPay);
	System.out.print("\n");
	
	System.out.print("**********Take Home Pay********\n");
	System.out.println("Gross Pay:"+grossPay);
	System.out.println("Income Tax Payable at "+taxRate+" is:"+tax);
	System.out.println("Netpay : "+netPay );

	System.out.print("\n");
	
	
		
	}//end main






}//end class