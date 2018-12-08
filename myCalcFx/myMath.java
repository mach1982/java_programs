/*
   Author:Ailin Mac Hugh
   Date:29/01/2018
   Version: 1.0

   My Math class

   Implements Addation , Subtraction , Mulpiucation , Division and Squaring of numbres


 */

public class myMath {

private String operator;
private double x=0.00F;
private double y=0.00F;





/**
 * Returns value of operator
 * @return
 */
public String getOperator() {
        return operator;
}

/**
 * Sets new value of operator
 * @param
 */
public void setOperator(String operator) {
        this.operator = operator;
}

/**
 * Returns value of x
 * @return
 */
public double getX() {
        return x;
}

/**
 * Sets new value of x
 * @param
 */
public void setX(double x) {
        this.x = x;
}

/**
 * Returns value of y
 * @return
 */
public double getY() {
        return y;
}

/**
 * Sets new value of y
 * @param
 */
public void setY(double y) {
        this.y = y;
}




public double add (){


        return this.getX()+ this.getY();

}

public double sub (){


        return this.getX()-this.getY();

}

public double mul (){


        return this.getX()*this.getY();

}

public double div (){


        return this.getX()/this.getY();

}


public double squr (){


        return this.getX()*this.getX();

}











}
