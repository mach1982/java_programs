public class Main {

public static void main(String[] args) {

        // creat Pizza objexts
        Pizza p1=new Pizza();
        Pizza p2 =new Pizza();
        Pizza p3 =new Pizza();

        //Instance Variables
        p1.size="Small";
        p1.toppings="Hma and Pinapple";
        p1.diameter=12.00;
        p1.price=10;


        p2.size="Medium";
        p2.toppings="Chicken and Mushroom";
        p2.diameter=14.00;
        p2.price=12;

        p3.size="Large";
        p3.toppings="Tuna and  Sweetcorn";
        p3.diameter=16.00;
        p3.price=14;

        //calling methdos
        System.out.print(p1.toString());
        System.out.print("\n");
        System.out.print(p1.eat());

        System.out.print("\n");

        System.out.print(p2.toString());
        System.out.print("\n");
        System.out.print(p2.eat());

        System.out.print("\n");

        System.out.print(p3.toString());
        System.out.print("\n");
        System.out.print(p3.eat());


}

}
