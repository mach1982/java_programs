/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author mach
 */
public class bmiCalc {
    
    private float heigth;
    private float weight;

    /**
     * @return the heigth
     */
    public float getHeigth() {
        return heigth;
    }

    /**
     * @param heigth the heigth to set
     */
    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getBMI(){
        
        return ((getWeight()) / (getHeigth()*getHeigth()))*10000;
    }
    
}
