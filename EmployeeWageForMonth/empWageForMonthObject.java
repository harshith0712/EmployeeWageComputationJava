package EmployeeWageForMonth;
import EmployeeWageForMonth.empWageForMonthLogic;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : program for encapsulating empWageForMonthLogic
class and their members
* */
public class empWageForMonthObject {
private int empRatePerHr;
private int numWorkingDays;

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public void setEmpRatePerHr(int empRatePerHr) {
        this.empRatePerHr = empRatePerHr;
    }

    public int getNumWorkingDays() {
        return numWorkingDays;
    }

    public void setNumWorkingDays(int numWorkingDays) {
        this.numWorkingDays = numWorkingDays;
    }
}
