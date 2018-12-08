public class Vechicle {

private String manufacturer;
private float engineSize;
private String registionNo;
private boolean NCT;

//setters

public void setManufacturer(String manufacturer){

        this.manufacturer = manufacturer;

}

public void setEngineSize( float engineSize){

        this.engineSize= engineSize;

}

public void setRegNo( String registionNo){

        this.registionNo=registionNo;
}

public void setNct(boolean NCT){

        this.NCT =NCT;
}

//getters

public String getManufacturer(){

        return this.manufacturer;
}

public float getEngineSize(){

        return this.engineSize;
}

public String getRegNo(){

        return this.registionNo;
}

public boolean getNct(){

        return this.NCT;
}

//constructors.

public Vechicle(String manufacturer, float engineSize, String registionNo, boolean NCT){

        this.manufacturer = manufacturer;
        this.engineSize=engineSize;
        this.registionNo=registionNo;;
        this.NCT =NCT;
}


public Vechicle (String manufacturer, float engineSize, String registrationNo){

        this(manufacturer, engineSize,registrationNo,false);

}

public Vechicle(String manufacturer, float engineSize){
        this(manufacturer,engineSize,"not vaild ", false);
}

public Vechicle(String manufacturer){

        this(manufacturer,0.0f,"not vaild", false);

}

public Vechicle(){
}


public String accelarte(){

        return "Accelerating ...";
}

public String brake(){

        return "Vehicle breaking....";
}

//toString

public String toStrin(){

        return "Manufacturer=\n"+getManufacturer()+"Engine Size=\n"+getEngineSize()+"RegistrationNo="+getRegNo()+"\n";
}

}
