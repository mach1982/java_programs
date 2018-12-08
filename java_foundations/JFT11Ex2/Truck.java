public class Truck extends Vechicle {

private boolean isTrailer;


//setter
public void settIsTrailer(boolean isTrailer){

        this.isTrailer=isTrailer;
}


//getters

public boolean getIsTrailer(){

        return this.isTrailer;
}

//constructors

public Truck (String manufacturer, float engineSize, String registrationNo, boolean NCT){

        super(manufacturer, engineSize, registrationNo,  NCT);

}


public Truck(String manufacturer, float engineSize, String registrationNo){


        this(manufacturer, engineSize,registrationNo,false);

}

public Truck(String manufacturer, float engineSize){

        this(manufacturer,engineSize,"not specfied", false);
}

public Truck(String manufacturer){

        this(manufacturer,0.0f,"not specfied", false);

}

public Truck(){

        this("not specified",0.0f,"not specified",false);


}

@Override
public String brake(){

        return "Truck breaking....";
}

@Override
public String toString(){

        return "Manufacturer="+getManufacturer()+"," +"\nEngine Size="+getEngineSize()+","+"\nRegistrationNo="+getRegNo()+","+"\nHas Trailer? "+getIsTrailer()+",";
}

}
