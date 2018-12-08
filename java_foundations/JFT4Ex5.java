public class JFT4Ex5{
	
	public static void main(String[] args){
	
	double principalSum=1000;
	double rate=5;
	double intrestRate=rate/100;
	double total;
	double intrestEarned=(intrestRate*principalSum);
	total = intrestEarned + principalSum;
	
	System.out.println("The principal is " + principalSum +"euro.");
	System.out.println("The rate of intrest is "+intrestRate);
	System.out.println("The intrest earned is "+intrestEarned);
	System.out.println("The vaule of the investment is "+total+ "euro");
	
		
	}//end main






}//end class