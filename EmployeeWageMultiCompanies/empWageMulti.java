package EmployeeWageMultiCompanies;
/*
@author : harshith kolagatla
Created Date : 18th october 2020
Functionality : program for employee wage for multiple Companies
* */
public class empWageMulti {
    public static void main(String args[]) {
        empWageMultiObject object = new empWageMultiObject();
        object.setCompanyName("Reliance");
        object.setEmpRatePerHr(20);
        object.setNumWorkingDays(20);
        object.setTotalWorkingHrs(100);
        empWageMultiLogic reliance= new empWageMultiLogic();
        reliance.WageHrs(object.getCompanyName(), object.getEmpRatePerHr(), object.getNumWorkingDays(), object.getTotalWorkingHrs());

        object.setCompanyName("D Mart");
        object.setEmpRatePerHr(20);
        object.setNumWorkingDays(20);
        object.setTotalWorkingHrs(100);
        empWageMultiLogic Dmart = new empWageMultiLogic();
         Dmart.WageHrs(object.getCompanyName(), object.getEmpRatePerHr(), object.getNumWorkingDays(), object.getTotalWorkingHrs());


    }

}
