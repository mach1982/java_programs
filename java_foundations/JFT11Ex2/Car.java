public class Car extends Vechicle {


private static int noCarsProduced;

public Car(String manufacturer, float engineSize, String registrationNo, boolean NCT){


        super(manufacturer, engineSize, registrationNo,  NCT);

        Car.noCarsProduced++;


}


public Car(String manufacturer, float engineSize, String registrationNo){


        this(manufacturer, engineSize,registrationNo,false);

}

public Car(String manufacturer, float engineSize){

        this(manufacturer,engineSize,"not specified", false);
}

public Car(String manufacturer){

        this(manufacturer,0.0f,"not specified", false);

}

public Car(){
        this("not specified",0.0f,"not specified",false);

}



@Override
public String brake(){

        return "Car breaking....";
}

//toString

@Override
public String toString(){

        return "Manufacturer=,"+getManufacturer()+"\nEngine Size=,"+getEngineSize()+"\nRegistrationNo=,"+getRegNo();
}


public static int getNoOfCars(){

        return Car.noCarsProduced;
}

}
