import java.util.*;

public class JFT14Ex4 {

public static void main(String[] args) {

        String[] destinations ={"Cork","Athlone","Limerick: ","Sligo","Dublin"};
        int selection=0;
        boolean entry =false;

        Scanner input = new Scanner(System.in);



        for( int i =0; i <=destinations.length-1; i++) {


                System.out.println(i+1+":"+ destinations[i]);

        }

        System.out.print("Enter a number to make your selection:");

        do {

                try{



                        selection=input.nextInt();
                        System.out.println("You will have great time in "+ destinations[selection-1]+"!");
                        entry=true;

                }
                catch(InputMismatchException e) {
                        System.out.println("Incorrerct Data vaule entered");
                        input.nextLine();



                }

                catch(ArrayIndexOutOfBoundsException ae) {

                        System.out.print("A vaule from 1-5 should be enteted:");

                }

        }
        while(entry==false);
}

}
