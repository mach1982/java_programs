

import java.lang.*;

public class JFT14Ex2 {

public static void main(String[] args) {

        int num1=10;
        int num2 =0;
        int num3=0;

        try {

                int result = num1/num2;
                System.out.println(result);
        }
        catch( ArithmeticException ae) {

                System.out.println("Error : Arithmetic Execption. Cannot / 0.Program closing");
        }
}

}
