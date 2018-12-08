public class NumberRange {

public void  checkInRange (int lower_range_value, int upper_range_value,int no_to_search){


        String msg ="";

        for (int i=lower_range_value; i<=upper_range_value; i++) {
                if (i==no_to_search) {

                        msg= "No.in range!";

                }

                if (i!=no_to_search) {

                        msg= "No. not in range!";

                }





        }

        System.out.println(msg);

}


}
