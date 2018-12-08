import java.util.Random;

public class JFT13Ex5 {

public static void main(String[] args) {

        //Array of card suits
        String[] suits = new String[4];
        suits[0] ="HEARTS";
        suits[1]="DIAMONDS";
        suits[2]="SPADES";
        suits[3]="CLUBS";



        // Array of the face vauleof each card Ace =1 ....King=13
        String[] cards= new String[13];
        cards[0]="ACE";
        cards[1]="TWO";
        cards[2]="THREE";
        cards[3] ="FOUR";
        cards[4]="FIVE";
        cards[5]="SIX";
        cards[6]="SEVEN";
        cards[7]="EIGHT";
        cards[8]="NINE";
        cards[9]="TEN";
        cards[10] ="JACK";
        cards[11]="QUEEN";
        cards[12]="KING";

        //creating Ramdom objects
        Random suitCard =new Random();

        Random r_card = new Random();

        int[] value = new int[3];

        for(int i =0; i <3; i++) {


                //gett inga random postion of both suits and cards.
                // the postion of suits dosen't matter


                int randCardPos = r_card.nextInt(12);

                int suitVal= suitCard.nextInt(4);

                //gettting the value of the location as  as an array is n-1 elements , the loction vaule will n+1
                //randCardPos[9]=TEN theefore 9+1 =10
                int loc= randCardPos+1;

                System.out.println(cards[randCardPos]+" of "+suits[suitVal]);

                value[i]=loc;

        }

        int score =value[0]+value[1]+value[2];
        System.out.println("Your score is :" + score);
        if(score <= 21) {

                System.out.println("Result - Victory -You beat the houses!");
        }
        else{
                System.out.println("Result - Defeat -house wins !");

        }

}

}
