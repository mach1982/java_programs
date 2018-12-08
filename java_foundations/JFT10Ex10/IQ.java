public class IQ {

private String name;
private int age;
private float iQScore;

//Getters and Setter metheods

public String getName(){

        return this.name;

}

public void setName(String n){

        this.name =n;

}


public int getAge(){

        return this.age;

}

public void setAge(int a){

        this.age =a;

        if (this.age!=0 && this.age>115) {

                this.age=0;
        }

}

public float getIQScore(){

        return this.iQScore;

}

public void setIQScore(float iq){

        this.iQScore =iq;

        if (this.iQScore!=0 && this.iQScore>200) {

                this.iQScore=0;
        }

}

//end getters & Setters


public String  toString(){

        return "Name :"+name+" Age:"+age +" IQ score: "+iQScore+"\n";



}

public String IQReport(){

        String avg="";

        if (iQScore<100) {

                avg="below average.";

        }

        if (iQScore>=100 && iQScore<=150) {

                avg="above average.";

        }

        if (iQScore>=150) {

                avg="exceptional.";

        }

        return "Your Score of: "+iQScore+" is "+avg+"\n";



}

}
