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
        empParttimeWageObject object=new empParttimeWageObject();
        object.setEmpRatePerHr(20);
        empParttimeWageLogic wage = new empParttimeWageLogic();
        int Salary=wage.PartWage(object.getIsFulltime(), object.getIsPartTime(), object.getEmpRatePerHr());
        if (Salary>0)
            System.out.println("the employee salary is "+Salary);
    }
}
