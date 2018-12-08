import java.util.*;

public class JFT9Ex3 {


public static void main(String[] args) {

        ArrayList <String> teams = new ArrayList<String>();

        teams.add("Chelsea");
        teams.add("Manchester City");
        teams.add("Arsenal");
        teams.add("Manchester Utd");

        int i=0;

        while (!teams.isEmpty()&& i<teams.size()) {



                System.out.println(teams.get(i));
                i++;




        }//end while

        if (!teams.contains("Leeds Utd")) {
                System.out.println("False");

        }//end if

        int manu =teams.indexOf("Manchester Utd");




        teams.set(manu,"Liverpool");
        teams.remove("Manchester Utd");

        System.out.println(teams.get(2));
        System.out.println("\n");
        System.out.println(teams.indexOf("Liverpool"));

        for(String team : teams) {

                System.out.println(team);

        }//end for loop

}//end main



}//end class
