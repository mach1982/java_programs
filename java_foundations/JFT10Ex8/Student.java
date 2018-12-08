public class Student {

public String firstName;
public String lastName;
public byte age;
public String className;
public float gradeAverage;
public String address;

public String toString(){

        return "First Name:"+firstName+"\nLast Name:"+lastName+"\nAge:"+age+"\nClassName:"+className+"Grade Average:" +gradeAverage+"Address:"+address;

}


public static int noOfstudents;
public static float totalGrades;

public static float avgGrades(){

        return totalGrades/noOfstudents;


}





}
