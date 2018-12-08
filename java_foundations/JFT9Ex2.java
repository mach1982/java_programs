import java.util.*;

public class JFT9Ex2 {




public static void main(String[] args ){
        ArrayList <String> destinations =new ArrayList<String>();

        destinations.add("Ibiza");
        destinations.add("Gran Canaria");
        destinations.add("Nice");
        destinations.add("Tropea");


        for (int i=0; i<destinations.size(); i++) {

                System.out.println(destinations.get(i));


        }


        if (!destinations.isEmpty()) {
                System.out.println("Fasle");
        }


        System.out.println(destinations.size());
        System.out.println(destinations.indexOf("Tropea"));
        destinations.set(2,"Fuerteventura");
        destinations.remove("Gran Canaria");

        if (!destinations.contains("Nice")) {
                System.out.println("True");

        }

}//sen main




}//end class
