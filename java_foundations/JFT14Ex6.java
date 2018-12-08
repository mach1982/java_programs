import java.util.*;
import java.lang.*;

public class JFT14Ex6 {


public static void StringExtract(){


        boolean entry =false;
        int posOfWord =0;
        int indexOfSpace=0;
        int nextIndexOfSpace=0;
        int slength=0;
        Scanner input =new Scanner(System.in);


        System.out.print("Enter in a message:");

        String msg=input.nextLine();

        int lastIndexOFSpace = msg.lastIndexOf("");





        do {

                try{


                        System.out.println("Now enter ther postion of the character you whish to extract.For example : 2");
                        posOfWord =input.nextInt();

                        //System.out.println(msg);

                        String[] s = msg.split(" ");
                        slength=s.length;
                        System.out.println("The extracted word  : "+ s[posOfWord-1]);

                        entry=true;


                }


                catch (InputMismatchException ie ) {
                        System.out.print("Enter a number not text");
                        input.nextLine();



                }

                catch(ArrayIndexOutOfBoundsException e) {
                        System.out.print("Eenter a number  <" + slength+"\n");
                        input.nextLine();
                }

        }
        while(entry==false);




}

public static void main(String[] args) {

        StringExtract();

}

}
