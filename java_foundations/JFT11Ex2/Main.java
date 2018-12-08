public class Main {

public static void main(String[] args) {

        Car c1 =new Car("Subaru Hatchback",53.45F, "89C4545", true);
        System.out.println(c1.toString());
        System.out.println(c1.brake());
        System.out.println(c1.accelarte());
        System.out.println();



        Car c2 = new Car();
        c2.setManufacturer("Tyota Carola");
        c2.setEngineSize(45.44F);
        c2.setRegNo("98C4343");
        c2.setNct(true);



        System.out.println(c2.toString());
        System.out.println(c2.brake());
        System.out.println(c2.accelarte());
        System.out.println();
        System.out.println(Car.getNoOfCars() + " Cars Have been produced");
        System.out.println();

        Truck t1 = new Truck("Ford Transist");
        System.out.println(t1.toString());
        System.out.println(t1.brake());
        System.out.println(t1.accelarte());
        System.out.println();

        Truck t2 = new Truck("Hyundia Pick-up", 89.45F,"99C5344", true);
        System.out.println(t2.toString());
        System.out.println(t2.brake());
        System.out.println(t2.accelarte());


}


}
