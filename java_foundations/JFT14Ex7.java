import java.io.*;


public class JFT14Ex7 {



public void writeToFile(){

        File f = new File("/media/cdrom/My Poem.txt");

        try{

                FileWriter fw=new FileWriter(f,true);

                BufferedWriter bw = new BufferedWriter(fw);

                PrintWriter pw = new PrintWriter(bw);

                pw.println("The quick brown fox jumped over the moon.\nAs he leapt, he looked back over his shoulder and cried aloud,Hello World!");

                System.out.println("Success!");

                pw.close();


        }
        catch( IOException e) {

                System.out.println("Uableto write to the file at this time");
        }


}


public static void main(String[] args) {

        new JFT14Ex7().writeToFile();

}

}
