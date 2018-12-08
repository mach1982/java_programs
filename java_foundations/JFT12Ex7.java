public class JFT12Ex7 {

public static void main(String[] args) {

        String message1="Message in a bottle";
        String message2="message in a Jar";

        int lenMsg1 =message1.length();
        int lenMsg2 =message2.length();

        System.out.println("Message 1 hasa length of:"+lenMsg1+" chars.");
        System.out.println("Message 2 hasa length of:"+lenMsg2+" chars.");



        if (lenMsg1 > lenMsg2) {
                System.out.println( message1 +" is longer than "+ message2);

        }

        else if (lenMsg2 > lenMsg1) {

                System.out.println( message2 +" is longer than "+ message1);

        }


}

}
