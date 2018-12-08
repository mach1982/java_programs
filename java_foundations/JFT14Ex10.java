import java.io.*;

public class JFT14Ex10 {


public void methodA() throws IOException {

        methodB();


}

public void methodB() throws IOException {

        File f=new File("ouput.txt");



        FileWriter fw=new FileWriter(f,true);

        BufferedWriter bw = new BufferedWriter(fw);

        PrintWriter pw = new PrintWriter(bw);

        pw.println("I am learning Java Programming");

        System.out.println("Message Written to text file ");

        pw.close();


}





public static void main(String[] args) {

        try{

                new JFT14Ex10().methodA();

        }

        catch( IOException e) {

                System.out.println("Error : Unable to write to file!");
        }

}

}
