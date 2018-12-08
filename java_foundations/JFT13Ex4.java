import  java.util.*;
import java.text.*;
import java.lang.Math;

public class JFT13Ex4 {

public static void main(String[] args) {

        double basicRate=29.39;
        double otRate=1.5;
        double tax35 =0.35;
        double tax20 =0.20;



        Scanner employeeName = new Scanner(System.in);
        Scanner employeePPS = new Scanner(System.in);
        Scanner employeeDept = new Scanner(System.in);
        Scanner hoursWorked = new Scanner(System.in);
        Scanner overTime = new Scanner(System.in);


        System.out.print("Enter Employee Name:");
        String empName = employeeName.nextLine();

        System.out.print("Enter Emplotee PPS NO:");
        String ppsNO=employeePPS.nextLine();

        System.out.print("Enter Employee Departmnet:");
        String departmnet=employeeDept.nextLine();

        System.out.print("Enter basic Hours Worked:");
        double basicHours= hoursWorked.nextFloat();

        System.out.print("Enter Overtime Hours worked:");
        double ot =overTime.nextFloat();

        double basicSalary= basicRate *basicHours;
        double otSalary =ot*(basicRate*otRate);
        double salary = basicSalary+otSalary;

        double takeHome =0.0F;
        String income ="";
        double tax=0.0F;

        if(salary >= 2000) {

                tax= salary*tax35;
                takeHome = salary-tax;
                income ="Income Tax Payable at 35% is:";


        }

        if(salary <= 2000) {

                tax= salary*tax20;
                takeHome= salary-tax;
                income ="Income Tax Payable at 20% is:";
        }

        System.out.println("*************************Salary Report*************************");
        System.out.println("\n\n");
        System.out.println("*************************Employee Detals*************************");

        System.out.println("Employee Name"+empName);
        System.out.println("Employee PPS No"+ppsNO);
        System.out.println("Employee Departmnet"+departmnet);
        System.out.println("\n\n");
        System.out.println("*************************Hours Worked*************************\n");
        System.out.printf("No. of basic hous worked:%.2f %n",basicHours);

        System.out.printf("The Hourly rate of basic pay is at %.2f euro %n", basicRate);
        System.out.printf("Basic Salary %.2f %n",basicSalary );
        System.out.printf("No. of overtime hours worked %.2f %n",ot );
        System.out.printf("The Hourly rate of pay is at of pay is at time and a half %n");
        System.out.printf("Overting salary %.2f %n",otSalary);
        System.out.println("*************************Take Home Pay *************************");
        System.out.printf("Gross Pay %.2f %n",salary);
        System.out.printf("%s %.2f %n",income,tax);
        System.out.printf("Netpay %.2f %n",takeHome);
        System.out.println("\n\n");
        System.out.println("***************************************************************");











}

}
