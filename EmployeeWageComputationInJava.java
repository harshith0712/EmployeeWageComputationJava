/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : program to calculate full time employee
and part time employee daily wage while employee
hours per Month for multiple Companies
* */
public class EmployeeWageComputationInJava {
    public static void main(String args[]) {
        EmployeeWageObject object = new EmployeeWageObject();
        object.setCompanyName("Reliance");
        object.setEmpRatePerHr(20);
        object.setNumWorkingDays(20);
        object.setTotalWorkingHrs(100);
        EmployeeWageLogic reliance= new EmployeeWageLogic();
        reliance.WageHrs(object.getCompanyName(), object.getEmpRatePerHr(), object.getNumWorkingDays(), object.getTotalWorkingHrs());

        object.setCompanyName("D Mart");
        object.setEmpRatePerHr(20);
        object.setNumWorkingDays(20);
        object.setTotalWorkingHrs(100);
        EmployeeWageLogic Dmart = new EmployeeWageLogic();
        Dmart.WageHrs(object.getCompanyName(), object.getEmpRatePerHr(), object.getNumWorkingDays(), object.getTotalWorkingHrs());


    }

}
