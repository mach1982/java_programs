public class TESTJFT8Ex19{

	public static void main(String[] args){

		char[] responses = {'N','N','N','N','Y','Y','N','Y','N','N'};
		int noOfYes = 0;
		int noRequired = 7;
		boolean tripGoingAhead = false;
		int i=0; // while loop counter

		while (i<responses.length){
			if(responses[i]=='Y'){
				noOfYes++;
			}
			if(noOfYes == noRequired){
				tripGoingAhead = true;
				break;
			}
            i++; // increment counter
		}// loop

		if(tripGoingAhead == true){
			System.out.println("The fishing trip is going ahead!");
		}else{
			System.out.println("Insufficient numbers");
		}

	}// main

}// class
