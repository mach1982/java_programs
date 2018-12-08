public class JFT8Ex10{


public static void main(String[] args){

String[] passwd={"oxymoran","poxedfox","Kingfisher","cruiseshipper"};
boolean p=false;

String userPassword="cruiseshipper";
  for (String passwds:passwd){

    if(passwds.equals(userPassword)){

  System.out.println("Log-On Successful");
  p=true;
  break;

      }

}//end for

  if(!p){
System.out.println("You cannot be logged on using the specified password.");

}//end if
}//end man




}//end class
