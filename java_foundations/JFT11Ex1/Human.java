public class Human {

private String name;
private int age;
private String gender;
private float height;
private float weight;

//setters

public void setName(String name){

        this.name=name;
}

public void setAge( int age){

        this.age=age;


}


public void setGender(String gender){

        this.gender=gender;
}

public void setHeight(float height){

        this.height=height;

}

public void setWeight(float weight){

        this.weight=weight;


}
//getters

public String getName(){

        return this.name;

}

public int getAge(){

        return this.age;
}


public String getGender(){

        return this.gender;
}


public float getHeight(){

        return this.height;
}


public float getWeight(){

        return this.weight;
}


//methods

public String sleep(){

        return "Sleeping soundly.....";


}

public String  eat(){

        return "Eating slowly and chewing carefully...";



}

public String swim(){

        return "Arms rotating and pushing the body forward...";


}

public String  toString(){

        return "Name:"+name +"\nAge:"+age+"\nGender:"+gender+"\nHeight:"+height+"\nWeight:"+weight;



}


}
