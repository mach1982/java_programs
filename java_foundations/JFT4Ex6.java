public class JFT4Ex6{
	
	public static void main(String[] args){
	
	int amount =57;
	int ra;
	int twenty;
	int ten;
	int five;
	int one;
	
	twenty = (amount/20);
	ra= (amount%20);
	
	ten = (ra/10);
	ra =   (ra % 10);
	
	five= (ra /5);
	ra =  (ra%5);
	
	one = ra;
	System.out.println("************Coni Machine*******\n");
	System.out.println("No of 20's:"+twenty);
	System.out.println("No of 10's"+ten);
	System.out.println("No of 5's:"+five);
	System.out.println("No of 1s:"+one);
	System.out.println("\n");
	System.out.println("\n******************************");
	
	
		
	}//end main






}//end class