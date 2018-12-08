public class JFT12Ex2 {

public static void main(String[] args) {

        String javaFoundations = new String("Java Foundations");
        String jFoundations ="Java Foundations";

        System.out.println(javaFoundations == jFoundations); // False as tw separate objects  different menory locations
        System.out.println(javaFoundations.equals(jFoundations)); // true as it is comapring is he  the contents on the strings are equal
        System.out.println(javaFoundations.compareTo(jFoundations)); // true as it is comapring the contents on the strings retue 0 is they the same


}


}
