/*
@author : harshith kolagatla
Created Date : 17th october 2020
Functionality : logic to calculate full time employee
and part time employee daily wage while employee
hours per Month
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
