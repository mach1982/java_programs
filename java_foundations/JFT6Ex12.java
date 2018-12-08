public class JFT6Ex12{


	public static void main(String[] args){
		
		
		String status="D";
		
		
		switch(status){
			
		case "S":
			System.out.println("Status: Single.");
		break;
		case "D":
			System.out.println("Status: Divorce.");
			break;
		case "M":
			System.out.println("Status: Married.");

		case "W":
			System.out.println("Status: Widowed.");
			break;
			default:
		
			System.out.println("Invalid data");	
		
		
		}
		
	}
	
}