/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : program for encapsulating EmployeeWageLogic
class and their members
* */
public class EmployeeWageObject {
    private String CompanyName;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

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
