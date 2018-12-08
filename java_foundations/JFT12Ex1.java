public class JFT12Ex1 {

public static void main(String[] args) {

        //Not Modifdying x
        String x=new String("Java");
        x = x.concat("Rules"); // JavaRules
        System.out.println("x="+x);
        //Will Not Modifdy x, X = JavaRukes
        x.toUpperCase();
        System.out.println("x="+x);
        x.replace('a','X');
        System.out.println("x="+x);
        x.concat("REules!");
        System.out.println("x="+x);

}

}
