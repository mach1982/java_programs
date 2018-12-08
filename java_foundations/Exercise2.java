
/*
Program Name:Exercise2.java
Nmae: Ailin MacHugh
Date:01/12/2017
*/


public class Exercise2{

    public static void main(String args[]){


    int moneyInKitty=500;
    //loan array of type int
    int[] loan = {60,20,100,80,40,300,200,100};

    //will store the postion of next index of the loan array once there is insufficent funds
    int index=0;


    //fro loop to loo throug the in loan array
    for (int i=0; i<=loan.length;i++){

          // checking if loan[i] is < money in the kitty
          if(loan[i]<moneyInKitty){
              //printsout the current ammout in the kitty
              System.out.println("Cash in the post :" +moneyInKitty);
              System.out.println("Loan amount requested :"+loan[i]+ "- Loan amount granted\n");

              //subtract current amount from loan
              //smae as moneyInKitty=moneyInKitty-1oan[i]
              moneyInKitty-=loan[i];

            }//end if

            // checking if loan[i] is > money in the kitty
            else if (loan[i]>moneyInKitty){
                System.out.println("Cash in the pot:"+moneyInKitty);
                System.out.println("Loan requested :"+loan[i]);
                System.out.println("The exact loan request amount cannot be processed in full (insufficent funds available).");
                System.out.println("However we will give you wnat we can... \n"+ moneyInKitty);

                moneyInKitty-=loan[i];

                // The array is 8 elements long, but the inex is array.length-1 as arry start at 0
                //Add 1 to the current postion of the loan index, to mark the next postion after where there is insufficent funds and loop stops
                index=i+1;
                //break out of the loop
                break;




            }//end elseif



        }//end for loop


    // check if there is  money in the kitty, all vaules will less than 0 ie -100
    if(moneyInKitty<=0){

        System.out.println("\nCash remaining in the pot is:  0\n");
        System.out.println("The following loan request could not be facilitated:");

        //print out the value store in the remaining postion of the loan
        System.out.println(""+loan[index]);
        System.out.println(""+loan[index+1]);



          }//end if




    }// end main





}//end class
