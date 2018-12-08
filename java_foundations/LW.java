import java.util.*;
import java.io.*;

class LW {
public static String LongestWord(String sen) {

        // code goes here
        /* Note: In Java the return type of a function and the
           parameter types being passed are defined, so this return
           call must match the return type of the function.
           You are free to modify the return type. */

        return sen.split("");

}

public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
}

}
