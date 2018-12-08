public class Main {

public static void main(String[] args) {

        Adult a1 = new Adult();

        a1.setName("Billy White");
        a1.setAge(30);
        a1.setGender("male");
        a1.setHeight(6.5F);
        a1.setWeight(11.0F);
        a1.setPPSNO("5645614F");
        a1.setOccupation("Software Devloper");
        a1.setIsMarried(true);
        a1.setIsCarOwner(true);

        System.out.println(""+a1.toString());
        System.out.println(""+a1.eat());
        System.out.println(""+a1.drive());


        System.out.println("\n");

        Child c1 = new Child();

        c1.setName("Frank Davis");
        c1.setAge(3);
        c1.setGender("male");
        c1.setHeight(1.5F);
        c1.setWeight(3.0F);
        c1.setSchoolCardNo("");

        System.out.println(""+c1.toString());
        System.out.println(""+c1.eat());
        System.out.println(""+c1.swim());
        System.out.println("\n");

        Baby b1=new Baby();

        b1.setName("Gillian Taylor");
        b1.setAge(1);
        b1.setHeight(0.6F);
        b1.setWeight(1.0F);

        System.out.println(""+b1.toString());
        System.out.println(""+b1.sleep());
        System.out.println(""+b1.swim());
        System.out.println("\n");






}

}
