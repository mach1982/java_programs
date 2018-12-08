import java.util.*;

public class JFT14Ex5 {

public static void main(String[] args) {

        boolean entry =false;
        int posOfChar =0;

        Scanner input =new Scanner(System.in);

        System.out.print("Enter in a message:");

        String msg=input.nextLine();

        System.out.println("Now enter ther postion of the character you whish to extract.");

        do {

                try{

                        posOfChar =input.nextInt();
                        System.out.println("The extracted charcter from your message is : "+msg.charAt(posOfChar-1));

                        //System.out.println(msg);
                        entry=true;

                }


                catch (InputMismatchException ie ) {
                        System.out.print("Error: Please enter ina number less than 25 characters:");
                        input.nextLine();



                }

                catch(StringIndexOutOfBoundsException e) {
                        System.out.print("Error: Please enter a number less than " + msg.length() + " characters: ");
                }

        }
        while(entry==false);



}



}
