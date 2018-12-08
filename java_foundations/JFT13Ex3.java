import  java.util.*;
import java.text.*;

public class JFT13Ex3 {


public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entera decimal number :");
        float inputFloat= input.nextFloat();


        DecimalFormat df = new DecimalFormat(".00");

        System.out.println("Using decimal fromat object:"+ df.format(inputFloat) );
        System.out.printf("Usering printf() method %.2f %n", inputFloat);




}

}
