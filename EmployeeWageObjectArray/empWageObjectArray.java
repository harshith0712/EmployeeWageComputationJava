package EmployeeWageObjectArray;
/*
@author : harshith kolagatla
Created Date : 21th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage while employee
hours per Month for multiple Companies
* */
public class empWageObjectArray {
    public static void main(String args[]) {
        empWageObjectArrayObject[] object =new empWageObjectArrayObject[5];
        object[1] = new empWageObjectArrayObject("Reliance",20,20,100);
        object[2] = new empWageObjectArrayObject("D-mart",20,20,100);
        empWageObjectArrayLogic employeeObject= new empWageObjectArrayLogic();
        employeeObject.WageHrs(object[1].getCompanyName(), object[1].getEmpRatePerHr(), object[1].getNumWorkingDays(), object[1].getTotalWorkingHrs());

        employeeObject.WageHrs(object[2].getCompanyName(), object[2].getEmpRatePerHr(), object[2].getNumWorkingDays(), object[2].getTotalWorkingHrs());


    }
}
