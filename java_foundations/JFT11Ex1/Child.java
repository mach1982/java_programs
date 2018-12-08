public class Child extends Human {

private String schoolCardNo ="NA";

//setters

public void setSchoolCardNo(String schoolCardNo){

        this.schoolCardNo=schoolCardNo;

        if (getAge()<=5) {

                swim();
        }
        else{
                super.swim();


        }

}

//getters

public String getSchollCardNo(){

        return this.schoolCardNo;
}


@Override
public String  swim(){

        return "As the child is 5 years old or younger, armbands must be worn and  parental supervision is required. Arms rotating and pushing the body forward…";


}


public String  toString(){

        return super.toString()+"\nSchoolCard No:"+getSchollCardNo();



}

}
