import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.DecimalFormat;


public class JFT14Ex9 {

public static void main(String[] args) {

        //  File input =new File("Sales.txt");

        try{
                File saleSummary =new File("Sales Summary.txt");


                Scanner s = new Scanner(new File("Sales.txt"));

                ArrayList <String> lines =new ArrayList<String>();

                float saleTotal=0.0F;
                float avgSales=0.0F;


                while (s.hasNext()) {

                        lines.add(s.next());
                }

                s.close();

                String[] output =lines.toArray(new String[lines.size()]);

                for (int i=0; i <=output.length-1; i++) {
                        saleTotal += Integer.parseInt(output[i]);

                }


                avgSales=saleTotal/output.length;
                System.out.println("Total sales value is:" +new DecimalFormat("#.##").format(saleTotal));
                System.out.println("The average value is:"+ new DecimalFormat("#.##").format(avgSales));

                FileWriter fw=new FileWriter(saleSummary,true);

                BufferedWriter bw = new BufferedWriter(fw);

                PrintWriter pw = new PrintWriter(bw);

                pw.println("Sales Total" + new DecimalFormat("#.##").format(saleTotal)+" Sales Average:"+new DecimalFormat("#.##").format(avgSales));


                pw.close();

        }
        catch(FileNotFoundException e) {

                System.out.println("error");

        }

        catch(IOException io) {

                System.out.println("error");

        }



}


}
