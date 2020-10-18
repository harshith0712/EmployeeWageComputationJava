/*
@author : harshith kolagatla
Created Date : 17th october 2020
Functionality : logic to calculate full time employee
and part time employee daily wage while employee
hours per Month
* */
public class EmployeeWageComputationInJava {
    public static void main (String args[]) {
        System.out.println("Welcome to Employee Wage Problem");
        EmployeeWageLogic empwage=new EmployeeWageLogic();
        int totalSalary=empwage.EmpWage();
        if (totalSalary>0)
            System.out.println("the total salary of the employee is "+totalSalary);
    }

}
