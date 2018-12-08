public class JFT12Ex3 {

public static void main(String[] args) {

        String s1 = new String("dingity"); //Onject 1 memory loaction 1
        String s1 ="digity"; //Onject 2 memoray locayion 2
        String s3 =s2; // s3 is a new object but  now points to  the same memoray location as s2

        s1=s1.concat("rubber"); //s1 = dingity rubber;

        System.out.println("s1==s2") //fales two different objects
        System.out.prinln(s1.equals(s2)); // false as s1 now is now "dingity rubber"
        Ssytem.out.println(s2==s3); // true both point to the same location in memoray
        System.out.println(s2.equals(s3)); // true as bothe contains the same characters
        System.out.println(s1==s3);// fasle differ menory locations
        System.out.println(s1.equals(s3));// Fales contain differ characters
        System.out.println(s1+""+s2); // print dingity rubber <SPACE> dingity ;
}

}
