import java.io.*;

public class JFT14Ex8 {

public void readFile(){

        File f=new File("My Poem.txt");

        try{

                FileReader fr = new FileReader(f);

                BufferedReader br = new BufferedReader(fr);

                String line= br.readLine();

                while(line!=null) {

                        System.out.println(line);
                        line = br.readLine();

                }



                System.out.print("The contents of the text file have been successfully read!");

        }
        catch(IOException e) {

                System.out.println("Unable to read from the file at this time.");
        }

}

public static void main(String[] args) {
        new JFT14Ex8().readFile();
}

}
