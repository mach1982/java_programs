
/*
Program Name:Exercise1.java
Nmae: Ailin MacHugh
Date:30/11/2017
*/


public class Exercise1{

    public static void main(String[] args){

      //Player One  array
      int[] playerOne={10,6,8,9,7,12,7};
      //Player Two array
      int[] playerTwo={7,6,9,5,2,8,11};

      //test code
      //int[] playerOne={7,6,9,5,2,8,11};
      //int[] playerTwo={10,6,8,9,7,12,7};


      //Counter for the number of round each player won
      int roundWonP1=0;
      int roundWonP2=0;

      //number of rounds
      int noOFRounds=7;

      System.out.println("*************************Play Card Busters!!!*************************");

          //Loop through and compare the vaule at the  index of playerOne & playerTwo
          for(int i =0 ; i <playerOne.length;i++){


            //playerOne >playerTwo
            if(playerOne[i]>playerTwo[i]){
                System.out.println("Round No: "+(i+1) +" Player 1 wins the round: "+playerOne[i]+" beats "+playerTwo[i]+"\n");
                roundWonP1++;
              }// end of if

            //playerTwo >playerOne
            else if(playerTwo[i]>playerOne[i]){
              System.out.println("Round No: "+(i+1)+" Player 2 wins the round: "+playerTwo[i]+" beats "+playerOne[i]+"\n");
              roundWonP2++;

            }//end esle if

            //PlayerOne==PlayerTwo
            else if(playerTwo[i]==playerOne[i]){
              System.out.println("Round No: " +(i+1)+" Tie!: "+playerOne[i]+" ties "+playerTwo[i]+"\n");



            }//end esle if




          }// end for floop



  // round won by P1 > round won byP2 but < than the total number of rounds 7
  if (roundWonP1>roundWonP2 && roundWonP1< noOFRounds){
    System.out.println("Player One wins! He won "+roundWonP1+" rounds beating Player Two who won "+roundWonP2+" rounds!");

  }//end if

  // round won by P2 > round won by P1 but < than the total number of rounds 7
  else if (roundWonP2>roundWonP1 && roundWonP2< noOFRounds){


/* Prints out the final result. after checking  who has the higest score*/
System.out.println("Player Two wins! He won "+roundWonP2+" rounds beating Player One who won "+roundWonP1+" rounds!");

  }//end esle if




    }// end main method






}//end class
