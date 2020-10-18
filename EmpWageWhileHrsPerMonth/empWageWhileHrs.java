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
        empWageWhileHrsObject object=new empWageWhileHrsObject();
        object.setEmpRatePerHr(20);
        object.setNumWorkingDays(20);
        object.setTotalWorkingHrs(100);
        empWageWhileHrsLogic wage = new empWageWhileHrsLogic();
        int totalSalary = wage.WageHrs(object.getEmpRatePerHr(), object.getNumWorkingDays(), object.getTotalWorkingHrs());
        System.out.println("the total salary of the employee is " + totalSalary);
    }

}
