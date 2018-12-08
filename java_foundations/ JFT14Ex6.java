public class JFT14Ex6 {


public void StringExtract(){


        boolean entry =false;
        int posOfWord =0;

        Scanner input =new Scanner(System.in);

        System.out.print("Enter in a message:");

        String msg=input.nextLine();

        System.out.println("Now enter ther postion of the character you whish to extract.For example : 2");

        do {

                try{

                        posOfWord =input.nextInt();
                        System.out.println("The extracted word  : "+msg.subString(posOfWord-1," "));

                        //System.out.println(msg);
                        entry=true;

                }


                catch (InputMismatchException ie ) {
                        System.out.print("Enter a number not text");
                        input.nextLine();



                }

                catch(StringIndexOutOfBoundsException e) {
                        System.out.print("Eenter a number  <" + msg.length());
                }

        }
        while(entry==false);




}

}
