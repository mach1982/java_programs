public class Test {

public static void main(String[] args) {

        Television tv1 =new Television();

        tv1.channel=100;
        tv1.volumeLevel=5;
        tv1.on_off=true;

        tv1.channelUp();
        tv1.channelDown();
        tv1.volumeUp();
        tv1.volumeDown();
        tv1.setOn_Off(false);

        System.out.println(tv1.toString());

}



}
