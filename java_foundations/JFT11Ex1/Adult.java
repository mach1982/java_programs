public class Adult extends Human {

//Varibalers
private String ppsNo;
private String occupation;
private boolean isMarried;
private boolean isCarowner;


//setters
public void setPPSNO(String ppsNo){
        this.ppsNo=ppsNo;
}
public void setOccupation(String occupation){
        this.occupation =occupation;
}
public void setIsMarried(boolean isMarried){
        this.isMarried=isMarried;
}
public void setIsCarOwner(boolean isCarowner){
        this.isCarowner=isCarowner;
}

//getters

public String getPPSNO(){

        return this.ppsNo;
}
public String getOccuption(){

        return this.occupation;
}
public boolean getIsMarried(){

        return this.isMarried;
}

public boolean getIsCarOwner(){

        return this.isCarowner;
}

//methods

public String drive(){

        return "Driving a car safetely.....";


}

public String proceate(){

        return "Procreating.....";


}


public String  toString(){

        return super.toString() +"PPSNo:"+getPPSNO() +"\nOccupation:"+getOccuption()+"\nIs Married:"+getIsMarried()+"\nIs Car Owner:"+getIsCarOwner();



}

}
