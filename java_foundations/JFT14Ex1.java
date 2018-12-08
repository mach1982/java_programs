import java.lang.*;

public class JFT14Ex1 {

public static void main(String[] args) {

        String vaule="two";
        int parsedVaule=0;

        try{

                parsedVaule=Integer.parseInt(vaule);
                System.out.print(+parsedVaule);

        }
        catch (NumberFormatException e ) {

                System.out.println("Unable to parse dad .Program closing");

        }



}

}
