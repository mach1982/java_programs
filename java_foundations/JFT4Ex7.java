public class JFT4Ex7{
	
	public static void main(String[] args){
	
	double length= 25.00;
	double width=42.00;
	double price= 37.99;
	double squareFeet;
	double squareYards;
	double cost;
	
	squareFeet = (length*width);
	squareYards=(squareFeet/9);
	cost = squareYards*price;
	
	System.out.println("********************************************************************************");
	System.out.println("\t\tCarpeting Cost Analysis:\t\t\t");
	System.out.println("********************************************************************************");
	
	System.out.println("Square Feet:\t\t\t\t"+squareFeet);
	System.out.println("Square Yars:\t\t\t\t"+squareYards);
	System.out.println("Cost of Carperting in Square Yards\t"+cost+"euro");
	
	
	
		
	}//end main






}//end class