package EmpWageWhileHrsPerMonth;
/*
@author : harshith kolagatla
Created Date : 17th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage while employee
hours per month
* */
public class empWageWhileHrs {
    public static void main(String args[]) {
        empWageWhileHrsLogic wage = new empWageWhileHrsLogic();
        int totalSalary = wage.WageHrs();
        System.out.println("the total salary of the employee is " + totalSalary);
    }

}
