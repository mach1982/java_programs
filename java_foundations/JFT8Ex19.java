public class JFT8Ex19{

public static void main(String[] args){

char[] val ={'N','Y','Y','Y','Y','Y','N','Y','N','N'};
boolean trip =false;
int noOfYes=0;
int noRequired=7;
int i=0;

while(i <val.length){

//System.out.println(val[i]);
  if(val[i]=='Y'){

  noOfYes++;
}
if (noOfYes==noRequired){

  trip=true;
  break;
}
i++;
}//for
if (trip==true){

System.out.println("The fishing trip is going ahead!");

}
else{

System.out.println("Insufficient numbers");
}

}//main

}//end class
