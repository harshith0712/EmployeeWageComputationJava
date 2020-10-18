package ParttimeEmpWage;
/*
@author : harshith kolagatla
Created Date : 16th october 2020
Modified Date : 18th october 2020
Functionality : program for encapsulating the empParttimeWageLogic
class and their members
* */
public class empParttimeWageObject {
    private final int isFulltime=1;
    private final int isPartTime=2;
    private int empRatePerHr;

    public int getIsFulltime() {
        return isFulltime;
    }


    public int getIsPartTime() {
        return isPartTime;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public void setEmpRatePerHr(int empRatePerHr) {
        this.empRatePerHr = empRatePerHr;
    }
}
