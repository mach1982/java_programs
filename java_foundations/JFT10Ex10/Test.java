public class Test {


public static void main(String[] args) {

        IQ iq1=new IQ();
        IQ iq2=new IQ();
        IQ iq3=new IQ();

        iq1.setName("James Driver");
        iq1.setAge(46);
        iq1.setIQScore(87);


        System.out.println(iq1.toString());

        System.out.println(iq1.IQReport());

        iq2.setName("Helena Smith");
        iq2.setAge(126);
        iq2.setIQScore(101);


        System.out.println(iq2.toString());
        System.out.println(iq2.IQReport());


        iq3.setName("Daniel Jones");
        iq3.setAge(27);
        iq3.setIQScore(1510);


        System.out.println(iq3.toString());
        System.out.println(iq3.IQReport());

}

}
