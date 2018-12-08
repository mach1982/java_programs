public class JFT14Ex12 {


public static void main(String[] args) {

        new JFT14Ex12().methodA();
}

public void methodA(){

        methodB();
}

public void methodB () {

        try{
                int[] numbers ={10,20,40};

                System.out.println(numbers[100]);

        }

        catch(ArrayIndexOutOfBoundsException e) {

                System.out.println(" error Arry out of bounds.");
        }

}

}
