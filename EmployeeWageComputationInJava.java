/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 21th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage while employee
hours per Month for multiple Companies
* */
public class EmployeeWageComputationInJava {
    public static void main(String args[]) {
        EmployeeWageObject[] object =new EmployeeWageObject[5];
        object[1] = new EmployeeWageObject("Reliance",20,20,100);
        object[2] = new EmployeeWageObject("D-mart",20,20,100);
        EmployeeWageLogic employeeObject= new EmployeeWageLogic();
        employeeObject.WageHrs(object[1].getCompanyName(), object[1].getEmpRatePerHr(), object[1].getNumWorkingDays(), object[1].getTotalWorkingHrs());

       // EmployeeWageLogic Dmart = new EmployeeWageLogic();
        employeeObject.WageHrs(object[2].getCompanyName(), object[2].getEmpRatePerHr(), object[2].getNumWorkingDays(), object[2].getTotalWorkingHrs());


    }

}
