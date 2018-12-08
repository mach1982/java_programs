public class SmartPhone {

String name;
String manufacture;
static float price;
String releaseDate;
float creditRemaining;
boolean isFullyCharged;

public void makeCall(String noToCall){

        System.out.println("Dialing number :"+noToCall);

}


public void topupAmount(float topUpAmount){

        float topUp = topUpAmount+creditRemaining;

        System.out.println("You have succdessfully topped up by: "+topUpAmount+"Your new blance is :"+topUp);
}

public void  charge(){
        isFullyCharged =true;

        System.out.println("The smartphone is now fully recharged.");


}


public String toString(){

        return "\nName:"+name+"\nManufacturer:"+manufacture+"\nPrice:"+price+"\nRelesed Date:"+releaseDate+"\nCredit Remaining:"+creditRemaining+"\nCharged Status:"+isFullyCharged;

}


public static int noOfPhones;
public static float totalPrice;

public static float avgPrice(){

        return totalPrice/noOfPhones;


}

}
