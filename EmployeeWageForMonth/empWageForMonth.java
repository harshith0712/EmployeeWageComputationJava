package EmployeeWageForMonth;
import EmployeeWageForMonth.empWageForMonthLogic;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage using Switch case
* */
public class empWageForMonth {
    public static void main(String args[]) {
        empWageForMonthLogic wage = new empWageForMonthLogic();
        int totalSalary = wage.WageMonth();
            System.out.println("the total salary of the employee is " + totalSalary);
    }

}
