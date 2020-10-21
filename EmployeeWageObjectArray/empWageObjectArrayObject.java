package EmployeeWageObjectArray;
/*
@author : harshith kolagatla
Created Date : 21th october 2020
Functionality : program for encapsulating EmployeeWageLogic
class and their members
* */
public class empWageObjectArrayObject {
    private String CompanyName;
    private int empRatePerHr;
    private int numWorkingDays;
    private int totalWorkingHrs;

    public empWageObjectArrayObject(String companyName, int empRatePerHr, int numWorkingDays, int totalWorkingHrs) {
        CompanyName = companyName;
        this.empRatePerHr = empRatePerHr;
        this.numWorkingDays = numWorkingDays;
        this.totalWorkingHrs = totalWorkingHrs;
    }

    public String getCompanyName() {

        return CompanyName;
    }

    public void setCompanyName(String companyName) {

        CompanyName = companyName;
    }

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

    @Override
    public String toString() {
        return "EmployeeWageObject{" + "CompanyName='" + CompanyName + '\'' + ", empRatePerHr=" + empRatePerHr +
                ", numWorkingDays=" + numWorkingDays +
                ", totalWorkingHrs=" + totalWorkingHrs +
                '}';
    }

}
