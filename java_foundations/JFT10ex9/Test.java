public class Test {

public static void main(String[] args) {

        SmartPhone p1 = new SmartPhone();
        SmartPhone p2 = new SmartPhone();
        SmartPhone p3 = new SmartPhone();

        p1.name="Nooks 610";
        p1.manufacture="Nooks";
        p1.price=100.00f;
        p1.releaseDate="04/06/2008";
        p1.creditRemaining=0.00f;
        p1.isFullyCharged=false;

        System.out.println(p1.toString()+"\n\n");

        SmartPhone.noOfPhones++;
        SmartPhone.totalPrice += p1.price;


        p2.name="H£C Sensation 610";
        p2.manufacture="H3C";
        p2.price=110.00f;
        p2.releaseDate="14/07/2012";
        p2.creditRemaining=0.00f;
        p2.isFullyCharged=false;

        System.out.println(p2.toString()+"\n\n");
        SmartPhone.noOfPhones++;
        SmartPhone.totalPrice+= p2.price;


        p3.name="Simsung Desire";
        p3.manufacture="Simsung";
        p3.price=190.00f;
        p3.releaseDate="14/07/2015";
        p3.creditRemaining=0.00f;
        p3.isFullyCharged=false;

        System.out.println(p3.toString()+"\n\n");
        SmartPhone.noOfPhones++;
        SmartPhone.totalPrice += p3.price;

        System.out.println(SmartPhone.noOfPhones+" Smart phones have been created");
        System.out.println("The averasge price of a smartphone is :"+SmartPhone.avgPrice());


}

}
