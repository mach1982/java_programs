public class JFT6Ex4{


	public static void main(String[] args){
		
		int withdraw=20;
		int blance =180;
		int newBlance;
		
		if (withdraw < blance){
			newBlance = blance-withdraw;
			
			System.out.println("Withdrawal processed:"+withdraw);
			System.out.println("New Balnce :"+newBlance);
		}
		else{
			
			System.out.println("Not enough money");
			
		}
		


	}//end main



}//end class