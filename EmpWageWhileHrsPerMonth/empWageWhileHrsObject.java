package EmpWageWhileHrsPerMonth;
/*
@author : harshith kolagatla
Created Date : 17th october 2020
Modified Date : 18th october 2020
Functionality : program for encapsulating the empWageWhileHrs
class with their members
* */
public class empWageWhileHrsObject {
    private int empRatePerHr;
    private int numWorkingDays;
    private int totalWorkingHrs;

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

    public int getTotalWorkingHrs() {
        return totalWorkingHrs;
    }

    public void setTotalWorkingHrs(int totalWorkingHrs) {
        this.totalWorkingHrs = totalWorkingHrs;
    }
}
