public class Baby extends Human {

private boolean isTheething;

//seeter

public void setIsTheething(boolean isTheething){

        this.isTheething=isTheething;

}

//getters

public boolean getIsTheething(){

        return this.isTheething;
}

@Override
public String sleep(){


        return "Baby Having diffculty sleeping due to teething pain";
}

@Override
public String swim(){

        return "A baby can not swim";
}

public String  toString(){

        return super.toString()+"\nTheething"+getIsTheething();



}

}
