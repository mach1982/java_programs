public class Main {

public static void main(String[] args) {

        Jelly j1= new Jelly();
        Jelly j2= new Jelly();
        Jelly j3= new Jelly();

        j1.manufacture="Chivery";
        j2.manufacture="Nestles";
        j3.manufacture="Danones";

        j1.price=3.50;
        j2.price=3.42;
        j3.price=3.00;

        j1.flavor="Strawberry";
        j2.flavor="Banna";
        j3.flacor="Lemon";

        j1.noCalories=24;
        j2.noCalories=26;
        j3.noCalories=28

                       j1.expiryDate="25/06/2016";
        j2.expiryDate="27/07/2016";
        j3.expiryDate="28/06/2015";


        System.out.println(j1.setinstruction()+"\n"+j2.setinstruction()+"\n"+j3.setinstruction());
        System.out.println(j1.toString()+"\n"+j2.toString()+"\n"+j3.toString());


}


}
