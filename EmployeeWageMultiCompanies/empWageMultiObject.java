package EmployeeWageMultiCompanies;

public class empWageMultiObject {
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
