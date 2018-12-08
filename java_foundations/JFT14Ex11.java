import java.io.*;

public class JFT14Ex11 {


public void methodA()  {

        methodB();


}

public void methodB() {




        try{
                File f=new File("ouput2.txt");


                FileWriter fw=new FileWriter(f,true);

                BufferedWriter bw = new BufferedWriter(fw);

                PrintWriter pw = new PrintWriter(bw);

                pw.println("I am learning Java Programming");



                pw.close();

                System.out.println("Message Written to text file ");

        }

        catch(IOException e) {

                System.out.println("Error : Unable to write to file!");
        }
}





public static void main(String[] args) {


        new JFT14Ex11().methodA();





}



}
