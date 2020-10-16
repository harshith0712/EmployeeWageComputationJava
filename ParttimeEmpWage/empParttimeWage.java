package ParttimeEmpWage;
import ParttimeEmpWage.empParttimeWageLogic;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage
* */
public class empParttimeWage {
    public static void main(String args[]) {
        empParttimeWageLogic wage = new empParttimeWageLogic();
        int salary = wage.PartWage();
        System.out.println("the salary of the employee is " + salary);
    }
}
