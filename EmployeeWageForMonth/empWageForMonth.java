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
        empWageForMonthObject object=new empWageForMonthObject();
        object.setEmpRatePerHr(20);
        object.setNumWorkingDays(20);
        empWageForMonthLogic wage = new empWageForMonthLogic();
        int totalSalary = wage.WageMonth(object.getEmpRatePerHr(),object.getNumWorkingDays());
            System.out.println("the total salary of the employee is " + totalSalary);
    }

}
